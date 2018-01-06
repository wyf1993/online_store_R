package org.online.store.dao.base;

import java.util.List;

import org.hibernate.Session;
import org.online.store.model.BaseEntity;

public abstract class BaseDao<T extends BaseEntity> extends CriteriaDao<T> {

	// TODO session用完直接关闭了，需要让容器管理事物

	public void save(T object) {
		Session session = getSession();
		session.beginTransaction();
		session.save(object);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(T object) {
		Session session = getSession();
		Object instance = session.get(object.getClass(), object.getId());
		session.beginTransaction();
		session.delete(instance);
		session.getTransaction().commit();
		session.close();
	}

	public void update(T object) {
		Session session = getSession();
		session.beginTransaction();
		session.update(object);
		session.getTransaction().commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public T get(int objId) {
		Class<T> entityClass = getEntityClass(getClass());
		System.out.println(entityClass.getName());
		Object object = getSession().get(entityClass, objId);
		return (T) object;
	}

	public List<T> getAll() {
		String hql = "from " + getEntityClass(getClass()).getSimpleName();
		return getAllByHql(hql);
	}

}
