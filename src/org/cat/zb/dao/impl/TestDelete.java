package org.cat.zb.dao.impl;

import static org.junit.Assert.fail;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

public class TestDelete {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void m1(){
		Configuration configiguration = new Configuration().configure();  
        ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configiguration.getProperties());  
        ServiceRegistry registry = builder.buildServiceRegistry();   
        SessionFactory  factory = configiguration.buildSessionFactory(registry);  
		MsgDaoImpl msg = new MsgDaoImpl();
		msg.setSessionFactory(factory);
		msg.deleteMsgByUserId(25);
	}
}
