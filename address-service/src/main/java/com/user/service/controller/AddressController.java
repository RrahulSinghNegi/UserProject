package com.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.bean.Address;
import com.user.service.entity.AddressEntity;
import com.user.service.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@PostMapping("/createAddress")
	public AddressEntity createAddress(@RequestBody AddressEntity address){
		return addressService.addAddress(address);
		
	}
	
	@GetMapping("/")
	public Address getAddress(){
		return addressService.getAddress();
	}

}
