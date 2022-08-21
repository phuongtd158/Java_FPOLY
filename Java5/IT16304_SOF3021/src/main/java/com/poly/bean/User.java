package com.poly.bean;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class User {
	@NotBlank(message = "Khong duoc de trong ho ten")
	private String fullName;

	@NotBlank
	private String password;

	@NotBlank
	private String address;

	private int gender;

	@NotBlank
	@Email
	private String email;

	@NotBlank
	private String phoneNumber;
	private String avatar;
}
