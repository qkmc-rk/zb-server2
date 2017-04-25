package org.cat.zb.dao;

import java.util.List;

import org.cat.zb.entities.User;

public interface UserDao {
	
	/*
	 * get all users from mysql database
	 * @return list of users
	 * */
	List<User> getAll();
	
}
