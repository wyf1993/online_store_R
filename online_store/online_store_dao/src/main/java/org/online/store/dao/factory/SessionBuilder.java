package org.online.store.dao.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionBuilder {
	private static SessionFactory sessionFactory;
	static {
		Configuration config = new Configuration().configure();
		sessionFactory = config.buildSessionFactory();
	}
	private SessionBuilder() {
	}
	
	public static Session getSession(){
		return sessionFactory.openSession();
	}
	
}
