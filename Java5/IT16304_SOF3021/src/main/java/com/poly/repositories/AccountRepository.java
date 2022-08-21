package com.poly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poly.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query("select a from Account a where email like ':username'")
	public Account findAccountFPTByUsername(@Param("username") String username);
}
