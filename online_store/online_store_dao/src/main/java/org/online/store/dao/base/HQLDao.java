package org.online.store.dao.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.query.Query;
import org.online.store.model.BaseEntity;

public abstract class HQLDao<T extends BaseEntity> extends SQLDao<T> {

	@SuppressWarnings("unchecked")
	public T getByHql(String hql) {
		Query<T> query = getSession().createQuery(hql);
		return query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public List<T> getAllByHql(String hql) {
		Query<T> query = getSession().createQuery(hql);
		List<T> list = query.getResultList();
		int size = list.size();
		List<T> result = new ArrayList<>();
		for (int index = 0; index < size; ++index) {
			result.add((T) list.get(index));
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<T> getByHql(String hql, List<Object> params) {
		Query<T> query = getSession().createQuery(hql);
		int index = 0;
		for (; index < params.size(); ++index) {
			query.setParameter(index, params.get(index));
		}
		return query.list();
	}

	@SuppressWarnings("unchecked")
	public List<T> getByHql(String hql, Map<String, Object> params) {
		Query<T> query = getSession().createQuery(hql);
		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			query.setParameter(key, params.get(key));
		}
		return query.list();
	}

}
