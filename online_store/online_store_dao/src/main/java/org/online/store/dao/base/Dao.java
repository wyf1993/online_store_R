package org.online.store.dao.base;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class Dao {

	@Resource(name = "sysSessionFactory")
	private SessionFactory sessionFactory;

	private Session session;

	public Session getSession() {
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

}
