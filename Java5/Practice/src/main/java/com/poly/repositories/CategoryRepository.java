package com.poly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
