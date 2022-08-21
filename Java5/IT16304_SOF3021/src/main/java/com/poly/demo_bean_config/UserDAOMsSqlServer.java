package com.poly.demo_bean_config;

import com.poly.bean.User;

public class UserDAOMsSqlServer implements UserDAOInterface {
	@Override
	public void create(User user) {
		System.out.println("Create Sql Server");
	}

	@Override
	public void update(User user) {
		System.out.println("Update Sql Server");
	}

	@Override
	public void delete(User user) {
		System.out.println("Delete Sql Server");
	}

	@Override
	public User findById(int id) {
		System.out.println("Find by id Sql Server");
		return null;
	}
}
