package org.online.store.dao.individual;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.online.store.dao.base.BaseDao;
import org.online.store.model.SystemUser;
import org.springframework.stereotype.Repository;

@Repository(value = "systemUserDao")
public class SystemUserDao extends BaseDao<SystemUser> {

	public List<SystemUser> getByName(String name) {
		String hql = "from SystemUser user where user.name=:name";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		return getByHql(hql, params);
	}

}
