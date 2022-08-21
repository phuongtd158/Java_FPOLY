package com.poly.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.poly.bean.AccountModel;
import com.poly.entity.Account;
import com.poly.repositories.AccountRepository;

@Controller
@RequestMapping("/admin/account")
public class AccountController {

	@Autowired
	private AccountRepository accountRepo;

//    public AccountController(AccountRepository accountRepo) {
//        this.accountRepo = accountRepo;
//    }

	@GetMapping("create")
	public String create(Model model, @ModelAttribute("account") AccountModel account) {
		model.addAttribute("account", account);
		return "/admin/account/create";
	}

	@PostMapping("store")
	public String store(Account accountModel) {

		Account account = new Account();

		account.setActivated(accountModel.getActivated());
		account.setAdmin(accountModel.getAdmin());
		account.setEmail(accountModel.getEmail());
		account.setFullName(accountModel.getFullName());
		account.setPassword(accountModel.getPassword());
		account.setUsername(accountModel.getUsername());
		account.setPhoto(accountModel.getPhoto());

		this.accountRepo.save(account);

		System.out.println(account.getEmail());
		return "redirect:/admin/account/index";
	}

	@GetMapping("edit/{id}")
	public String edit(Model model, @PathVariable("id") Account account) {

		model.addAttribute("account", account);
		System.out.println("Fullname: " + account.getFullName());

		return "/admin/account/edit";
	}

	@PostMapping("update/{id}")
	public String update(@PathVariable("id") Integer id, AccountModel accountModel) {

		Account account = this.accountRepo.getById(id);

		account.setActivated(accountModel.getActivated());
		account.setAdmin(accountModel.getAdmin());
		account.setEmail(accountModel.getEmail());
		account.setFullName(accountModel.getFullName());
		account.setPassword(accountModel.getPassword());
		account.setUsername(accountModel.getUsername());
		account.setPhoto(accountModel.getPhoto());

		this.accountRepo.save(account);
		return "redirect:/admin/account/index";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Account account) {
		this.accountRepo.delete(account);
		return "redirect:/admin/account/index";
	}

	@GetMapping("index")
	public String index(Model model, @RequestParam(name = "page", defaultValue = "0") Integer page,
			@RequestParam(name = "size", defaultValue = "10") Integer size) {

		Pageable pageable = PageRequest.of(page, size);
		Page<Account> data = this.accountRepo.findAll(pageable);

		model.addAttribute("data", data);

		return "/admin/account/index";
	}
}
