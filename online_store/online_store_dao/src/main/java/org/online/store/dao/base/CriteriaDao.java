package org.online.store.dao.base;

import org.online.store.model.BaseEntity;

public abstract class CriteriaDao<T extends BaseEntity> extends HQLDao<T> {

	// TODO DAO条件搜索层未实现

//	public T getByFilter() {
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		builder.like("name", 1);
//		@SuppressWarnings("unused")
//		Criteria criteria = session.createCriteria(getEntityClass(getClass()));
//		return null;
//	}

}
