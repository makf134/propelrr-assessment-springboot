package com.kurtferrer.propelrrassessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kurtferrer.propelrrassessment.entity.User;
import com.kurtferrer.propelrrassessment.service.UserService;
import com.kurtferrer.propelrrassessment.utils.ResponseUtil;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody User user){
		return ResponseUtil.generateResponse("User successfully saved", userService.saveUser(user),HttpStatus.OK);
	}
}
