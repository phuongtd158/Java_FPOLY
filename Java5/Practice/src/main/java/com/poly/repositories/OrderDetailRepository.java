package com.poly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer>{

}
