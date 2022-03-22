package com.stgit.tsms.admin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "admin")
public class UserInfo {
	
	
	@GetMapping(value = "/createUser")
	public ResponseEntity<String> createUser(){
		System.out.println("helloWorld");
		
		return new ResponseEntity<String>("HelloWorld", HttpStatus.OK);
		
	}

}
