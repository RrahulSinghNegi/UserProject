package com.user.service.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.service.bean.Address;
import com.user.service.bean.User;
import com.user.service.entity.UserEntity;
import com.user.service.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/addUser")
	public UserEntity addUser(@RequestBody UserEntity user){
		return userService.addUser(user);
	}

	@GetMapping("/getUser")
	public User getUser(){
		
		User user=userService.getUser();
		
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      ResponseEntity<Address> response= restTemplate.exchange("http://localhost:8081/address/", HttpMethod.GET, entity, Address.class);
	      Address address = response.getBody();
	      user.setAddress(address);
	      return user;
	}
}
