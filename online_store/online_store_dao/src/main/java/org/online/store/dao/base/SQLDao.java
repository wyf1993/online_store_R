package org.online.store.dao.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.query.Query;
import org.online.store.model.BaseEntity;

public abstract class SQLDao<T extends BaseEntity> extends Dao {

	private Class<T> entityClass;

	@SuppressWarnings("unchecked")
	protected Class<T> getEntityClass(Class<?> originalType) {
		if (entityClass == null) {
			Type superclass = originalType.getGenericSuperclass();
			if (superclass instanceof ParameterizedType) {
				ParameterizedType type = (ParameterizedType) superclass;
				Type[] types = type.getActualTypeArguments();
				entityClass = (Class<T>) types[0];
			} else {
				entityClass = null;
			}
		}
		return entityClass;
	}

	@SuppressWarnings("unchecked")
	protected T getBySql(String sql) {
		Query<T> sqlQuery = getSession().createQuery(sql);
		return sqlQuery.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	protected List<T> getBySql(String sql, List<Object> params) {
		Query<T> sqlQuery = getSession().createQuery(sql);
		int index = 0;
		for (; index < params.size(); ++index) {
			Object obj = params.get(index);
			sqlQuery.setParameter(index, obj);
		}
		return sqlQuery.list();
	}

	@SuppressWarnings("unchecked")
	protected List<T> getBySql(String sql, Map<String, Object> params) {
		Query<T> sqlQuery = getSession().createQuery(sql);
		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			Object obj = params.get(key);
			sqlQuery.setParameter(key, obj);
		}
		return sqlQuery.list();
	}

}
