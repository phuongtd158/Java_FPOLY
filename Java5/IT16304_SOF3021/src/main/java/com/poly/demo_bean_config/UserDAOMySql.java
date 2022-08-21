package com.poly.demo_bean_config;

import com.poly.bean.User;

public class UserDAOMySql implements UserDAOInterface {

	@Override
	public void create(User user) {
		System.out.println("Create MySQL");
	}

	@Override
	public void update(User user) {
		System.out.println("Update MySQL");
	}

	@Override
	public void delete(User user) {
		System.out.println("Delete MySQL");
	}

	@Override
	public User findById(int id) {
		System.out.println("Find by id MySQL");
		return null;
	}

}
