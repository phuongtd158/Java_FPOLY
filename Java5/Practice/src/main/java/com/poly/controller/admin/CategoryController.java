package com.poly.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.entity.Category;
import com.poly.mapper.CategoryMapper;
import com.poly.model.CategoryModel;
import com.poly.repositories.CategoryRepository;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepo;

	@Autowired
	private CategoryMapper categoryMapper;

	@GetMapping("index")
	public String index(Model model, @ModelAttribute("category") CategoryModel category) {

		List<Category> listCategory = this.categoryRepo.findAll();
		model.addAttribute("listCategory", listCategory);

		return "/admin/category/index";
	}

	@PostMapping("store")
	public String store(CategoryModel categoryModel) {

		Category category = this.categoryMapper.convertToEntity(categoryModel);

		category.setName(categoryModel.getName());

		this.categoryRepo.save(category);
		return "redirect:/admin/category/index";
	}

	@GetMapping("edit/{id}")
	public String edit(Model model, @PathVariable("id") Category category) {

		List<Category> listCategory = this.categoryRepo.findAll();

		model.addAttribute("listCategory", listCategory);
		model.addAttribute("category", category);

		return "/admin/category/index";
	}

	@PostMapping("update/{id}")
	public String update(@PathVariable("id") Integer id, CategoryModel categoryModel) {

		Category category = this.categoryRepo.getById(id);

		category.setName(categoryModel.getName());

		this.categoryRepo.save(category);

		return "redirect:/admin/category/index";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Category category) {

		this.categoryRepo.delete(category);

		return "redirect:/admin/category/index";
	}
}
