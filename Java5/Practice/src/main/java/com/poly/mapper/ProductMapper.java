package com.poly.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.entity.Category;
import com.poly.entity.Product;
import com.poly.model.CategoryModel;
import com.poly.model.ProductModel;

@Service
public class ProductMapper {

	@Autowired
	private ModelMapper mapper;

	public Product convertToEntity(ProductModel productModel) {
		Product product = mapper.map(productModel, Product.class);
		return product;
	}

	public ProductModel convertToDTO(Product product) {
		ProductModel productModel = mapper.map(product, ProductModel.class);
		return productModel;
	}
}
