package com.poly.demo_bean_config;

import com.poly.bean.User;

public interface UserDAOInterface {
	public void create(User user);

	public void update(User user);

	public void delete(User user);

	public User findById(int id);
}
