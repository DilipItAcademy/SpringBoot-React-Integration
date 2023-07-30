package com.signupForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.signupForm.model.SignupModel;
import com.signupForm.service.SignupService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/user")
public class SignupController {

	@Autowired
	private SignupService service;

	@PostMapping("/signup")
	public String userRegister(@RequestBody SignupModel model) {
		return service.userRegisterService(model);
	}
}
