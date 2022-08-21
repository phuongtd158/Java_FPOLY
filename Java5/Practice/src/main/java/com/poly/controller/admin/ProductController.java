package com.poly.controller.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.entity.Category;
import com.poly.entity.Product;
import com.poly.mapper.ProductMapper;
import com.poly.model.ProductModel;
import com.poly.repositories.CategoryRepository;
import com.poly.repositories.ProductRepository;

@Controller
@RequestMapping("/admin/product")
public class ProductController {

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private CategoryRepository categoryRepo;

	@Autowired
	private ProductMapper mapper;

	@GetMapping("index")
	public String index(Model model, @ModelAttribute("productModel") ProductModel productModel,
			@RequestParam("sort-field") Optional<String> field) {

		List<Product> listProducts = this.productRepo.findAll();
		List<Category> listCategories = this.categoryRepo.findAll();

		Sort sort = Sort.by(Direction.DESC, field.orElse("price"));
		List<Product> listProductSort = this.productRepo.findAll(sort);

		model.addAttribute("listProducts", listProducts);
		model.addAttribute("listCategories", listCategories);
		model.addAttribute("listProducts", listProductSort);

		return "/admin/product/index";
	}

	@GetMapping("page")
	public String page(Model model, @RequestParam(name = "p", defaultValue = "0") Integer page,
			@RequestParam(name = "size", defaultValue = "5") Integer size) {

		Pageable pageable = PageRequest.of(page, size);
		Page<Product> data = this.productRepo.findAll(pageable);

		model.addAttribute("data", data);
		return "/admin/product/page";
	}

	@PostMapping("store")
	public String store(ProductModel productModel) {

		Product product = this.mapper.convertToEntity(productModel);
		Category category = this.categoryRepo.getById(productModel.getCategoryById().getId());

		product.setCategoryById(category);
		product.setPrice(productModel.getPrice());
		product.setCreateDate(productModel.getCreateDate());
		product.setName(productModel.getName());
		product.setAvailable(1);
		product.setImage("none");

		this.productRepo.save(product);

		return "redirect:/admin/product/index";
	}

	@GetMapping("edit/{id}")
	public String edit(Model model, @PathVariable("id") Product product) {

		ProductModel productModel = this.mapper.convertToDTO(product);
		List<Category> listCategories = this.categoryRepo.findAll();
		List<Product> listProducts = this.productRepo.findAll();
		Category category = this.categoryRepo.getById(product.getCategoryById().getId());

		model.addAttribute("productModel", productModel);
		model.addAttribute("listCategories", listCategories);
		model.addAttribute("listProducts", listProducts);
		model.addAttribute("cateId", category.getId());

		return "/admin/product/index";
	}

	@PostMapping("update/{id}")
	public String update(@PathVariable("id") Integer id, ProductModel productModel) {

		Product product = this.productRepo.getById(id);
		Category category = this.categoryRepo.getById(productModel.getCategoryById().getId());

		product.setCategoryById(category);
		product.setPrice(productModel.getPrice());
		product.setCreateDate(productModel.getCreateDate());
		product.setName(productModel.getName());
		product.setAvailable(1);
		product.setImage("none");

		this.productRepo.save(product);

		return "redirect:/admin/product/index";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Product product) {
		this.productRepo.delete(product);
		return "redirect:/admin/product/index";
	}
}
