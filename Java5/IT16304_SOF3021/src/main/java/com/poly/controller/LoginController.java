package com.poly.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.bean.AccountModel;

@Controller
public class LoginController {
	@GetMapping("login")
	public String loginGet() {
		return "login";
	}
	
	@PostMapping("login")
	public String loginPost(
			Model model,
			@RequestParam Map<String, String> requestParams
			) {
		String username = requestParams.get("username");
		String password = requestParams.get("password");
		if(username.equals("phuongtd") && password.equals("123")) {
			model.addAttribute("username", username);
			return "redirect:hello";
		}	
		
		return "login";
	}
	
//	@PostMapping("login")
//	public String login(Account account) {
//		System.out.println(account.getUsername());
//		System.out.println(account.getPassword());
//		return "login";
//	}
}
