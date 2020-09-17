package com.user.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.user.service.entity.AddressEntity;
import com.user.service.repositories.AddressRepositories;

@Repository
public class AddressDaoImpl implements AddressDao {

	@Autowired
	AddressRepositories addressRepository;
	
	public AddressEntity addAddress(AddressEntity address) {
		return addressRepository.save(address);
	}

	public Iterable<AddressEntity> getAddress() {
		return addressRepository.findAll();
	}

}
