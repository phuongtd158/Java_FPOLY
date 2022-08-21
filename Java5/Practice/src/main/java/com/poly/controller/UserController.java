package com.poly.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.poly.entity.Account;
import com.poly.mapper.AccountMapper;
import com.poly.model.AccountDTO;
import com.poly.repositories.AccountRepository;
import com.poly.utilities.UploadFileUtil;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    private UploadFileUtil uploadFileUtil;

    @Autowired
    private AccountRepository accountRepo;
    
    @Autowired
    private AccountMapper accountMapper;

    @GetMapping()
    public String index(Model model) {

        List<Account> listAccount = this.accountRepo.findAll();

        model.addAttribute("listAccount", listAccount);
        listAccount.forEach(account -> {
            System.out.println(account.getFullName());
        });

        return "/admin/user/index";
    }

    @GetMapping(value = "{id}")
    public String show(Model model, @PathVariable("id") Integer id) {

        Account account = this.accountRepo.getOne(id);
        
        AccountDTO accountDTO = this.accountMapper.convertToDTO(account);
        
        model.addAttribute("account", accountDTO);

        return "/admin/user/show";
    }

    @GetMapping("create")
    public String create() {
        return "/admin/user/create";
    }

    @PostMapping("store")
    public String store() {
        return "redirect:/admin/user";
    }

    @GetMapping(value = "edit/{id}")
    public String edit(Model model, @PathVariable("id") Account account) {
    	AccountDTO accountDTO = this.accountMapper.convertToDTO(account);
		model.addAttribute("account", accountDTO);
        return "/admin/user/edit";
    }

    @PostMapping(value = "update/{id}")
    public String update(Model model, @Valid AccountDTO accountDTO, BindingResult bindResult) {

        if (bindResult.hasErrors()) {
            System.out.println("Invalid form");
            model.addAttribute("errors", bindResult.getAllErrors());
            System.err.println(bindResult.getAllErrors());
            return "/admin/user/edit";
        } else {
            System.out.println("Ok");
            return "redirect:/admin/user";
        }
    }

    @PostMapping(value = "delete/{id}")
    public String delete() {
        return "redirect:/admin/user";
    }

    @GetMapping("upload-file")
    public String uploadFileForm() {
        return "/admin/user/upload-file";
    }

    @PostMapping("upload-file")
    public String uploadFile(@RequestParam("upload-file") MultipartFile uploadedFile) {
        this.uploadFileUtil.handleUploadFile(uploadedFile);
        return "/admin/user/upload-file";
    }

    @ResponseBody
    @GetMapping("demo-api")
    public String hello() {
        return "demo api";
    }
}
