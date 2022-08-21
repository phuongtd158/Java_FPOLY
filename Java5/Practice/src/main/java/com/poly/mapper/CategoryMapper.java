package com.poly.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.entity.Category;
import com.poly.model.CategoryModel;

@Service
public class CategoryMapper {

	@Autowired
	private ModelMapper mapper;

	public Category convertToEntity(CategoryModel categoryModel) {
		Category category = mapper.map(categoryModel, Category.class);
		return category;
	}

	public CategoryModel convertToDTO(Category category) {
		CategoryModel categoryModel = mapper.map(category, CategoryModel.class);
		return categoryModel;
	}
}
