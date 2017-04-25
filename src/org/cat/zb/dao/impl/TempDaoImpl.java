package org.cat.zb.dao.impl;

import java.util.List;

import org.cat.zb.dao.TempDao;
import org.cat.zb.entities.Temp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TempDaoImpl implements TempDao{

	/*
	 * sessionFactory
	 * */
	@Autowired
	SessionFactory sessionFactory;
	
	//get sessionµÄ·½·¨
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void saveTemp(Temp temp) {
		getSession().save(temp);
	}

	@Override
	public List<Temp> getOneHundredRecord() {
		String hql = "from Temp order by desc limit 100";
		return (List<Temp>) getSession().createQuery(hql);
	}

	
	/*
	 * setter and getter
	 * */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
