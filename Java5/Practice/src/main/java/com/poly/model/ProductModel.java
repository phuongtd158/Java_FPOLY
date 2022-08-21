package com.poly.model;

import java.sql.Date;

import com.poly.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
	private int id;

	private String name;

	private String image;

	private double price;

	private Date createDate;

	private int available;

	private Category categoryById;
}