package com.poly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
	
}
