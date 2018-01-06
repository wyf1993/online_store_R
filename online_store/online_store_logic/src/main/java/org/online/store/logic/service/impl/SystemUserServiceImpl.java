package org.online.store.logic.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.online.store.dao.base.BaseDao;
import org.online.store.dao.individual.SystemUserDao;
import org.online.store.logic.core.EntityService;
import org.online.store.logic.service.SystemUserService;
import org.online.store.model.SystemUser;
import org.online.store.util.exception.impl.LoginException;
import org.springframework.stereotype.Service;

/**
 * @author Nico Robin
 * @date 2017年12月17日 - 下午12:33:06
 * @todo 后台用户的业务逻辑
 **/

@Service(value = "systemUserService")
public class SystemUserServiceImpl extends EntityService<SystemUser> implements SystemUserService {

	@Resource(name = "systemUserDao")
	private SystemUserDao systemUserDao;

	@Override
	protected BaseDao<SystemUser> getDao() {
		return systemUserDao;
	}

	@Override
	public SystemUser login(String userName, String password) {
		if (userName == null || password == null) {
			return null;
		}
		List<SystemUser> users = systemUserDao.getByName(userName);
		if (users == null || users.isEmpty()) {
			throw new LoginException("The Account is not exist!", "用户名或密码错误!", getClass(),
					Thread.currentThread().getStackTrace()[1].getMethodName());
		} else {
			int size = users.size();
			for (int index = 0; index < size; ++index) {
				SystemUser systemUser = users.get(index);
				if (systemUser.getPassword().equals(password)) {
					return systemUser;
				}
			}
			throw new LoginException("The Error from the invalid password!", "用户名或密码错误!", getClass(),
					Thread.currentThread().getStackTrace()[1].getMethodName());
		}
	}

}
