package com.poly.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AccountModel {
	private Integer id;

//	@NotNull
//	@NotBlank
	private String username;

//	@NotNull
//	@NotBlank
	private String fullName;

//	@NotNull
//	@NotBlank
//	@Email
	private String email;

//	@NotNull
//	@NotBlank
	private String password;

//	@NotNull
//	@NotBlank
//	private String passwordConfirm;

//	@NotNull
//	@NotBlank
	private String photo;

//	@NotNull
	private Integer admin;

//	@NotNull
	private Integer activated;
}
