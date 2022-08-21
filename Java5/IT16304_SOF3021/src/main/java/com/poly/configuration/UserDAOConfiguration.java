package com.poly.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poly.demo_bean_config.UserDAOInterface;
import com.poly.demo_bean_config.UserDAOMsSqlServer;
import com.poly.demo_bean_config.UserDAOMySql;

@Configuration
public class UserDAOConfiguration {
	@Bean("user_dao_mysql")
	public UserDAOInterface getUserDAOBeanMySQL() {
		UserDAOMySql mySqlDAO = new UserDAOMySql();
		return mySqlDAO;
	}

	@Bean("user_dao_mssql")
	public UserDAOInterface getUserDAOMsSqlServer() {
		UserDAOMsSqlServer msSqlServerDAO = new UserDAOMsSqlServer();
		return msSqlServerDAO;
	}
}
