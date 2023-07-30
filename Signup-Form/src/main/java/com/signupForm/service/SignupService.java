package com.signupForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signupForm.entity.SignupEntity;
import com.signupForm.model.SignupModel;
import com.signupForm.repository.SignupRepository;

@Service
public class SignupService {
	
	@Autowired
	private SignupRepository repo;
	public String userRegisterService(SignupModel model)
	{
		SignupEntity entity = new SignupEntity();
		entity.setFirstName(model.getFirstName());
		entity.setLastName(model.getLastName());
		entity.setPassword(model.getPassword());
		entity.setMailId(model.getMailId());
		entity.setPhoneNumber(model.getPhoneNumber());
		entity.setAddress(model.getAddress());
		entity.setPincode(model.getPincode());
		repo.save(entity);
		return "{\"status\":200,\"response\":\"User registered successfully\"}";
	}
}
