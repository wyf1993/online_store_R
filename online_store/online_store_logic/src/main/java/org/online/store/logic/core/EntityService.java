package org.online.store.logic.core;

import java.util.List;

import org.online.store.dao.base.BaseDao;
import org.online.store.model.BaseEntity;

public abstract class EntityService<T extends BaseEntity> extends BaseService {

	protected abstract BaseDao<T> getDao();

	public T get(int id) {
		BaseDao<T> dao = getDao();
		return dao.get(id);
	}

	public List<T> getAll() {
		BaseDao<T> dao = getDao();
		return dao.getAll();
	}

	public void save(T obj) {
		if (obj == null) {
			return;
		}
		BaseDao<T> dao = getDao();
		dao.save(obj);
	}

	public void save(List<T> objs) {
		if (objs == null || objs.isEmpty()) {
			return;
		}
		BaseDao<T> dao = getDao();
		int size = objs.size();
		for (int index = 0; index < size; ++index) {
			dao.save(objs.get(index));
		}
	}

	public void update(T obj) {
		if (obj == null) {
			return;
		}
		BaseDao<T> dao = getDao();
		dao.update(obj);
	}

}
