package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.UserModel;
import com.api.repo.UserRepo;

@RequestMapping("/api")
@RestController
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/save")
	public String saveUserData(@RequestBody UserModel userModel) {
		UserModel u = userRepo.save(userModel);
		return "User Created";
	}
	
	@GetMapping("/get/{id}")
	public UserModel getData(@PathVariable int id) throws Exception {
		return userRepo.findById(id).orElseThrow(() -> new Exception("User not found with id: " + id));
	}
}
