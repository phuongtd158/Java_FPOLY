package com.poly.controller.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.bean.User;

@Controller
@RequestMapping("/admin/user")
public class UserController {

	@GetMapping("create")
	public String create(@ModelAttribute("user") User user) {
		return "/admin/user/create";
	}

	@PostMapping("store")
	public String store(Model model, @Valid User user, BindingResult bindResult) {
		if (bindResult.hasErrors()) {
			System.out.println("Invalid form");
			return "admin/user/create";
		} else {
			System.out.println("OK");
			model.addAttribute("user", user);
			return "redirect:/admin/user/create";
		}
	}
}
