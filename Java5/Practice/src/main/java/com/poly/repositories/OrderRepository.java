package com.poly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
