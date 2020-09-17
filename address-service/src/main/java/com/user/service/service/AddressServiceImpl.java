package com.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.bean.Address;
import com.user.service.dao.AddressDao;
import com.user.service.entity.AddressEntity;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressDao addressDao;
	
	public AddressEntity addAddress(AddressEntity address) {
		return addressDao.addAddress(address);
	}

	public Address getAddress() { 
		Address address= new Address();
		for(AddressEntity addressObj: addressDao.getAddress()){
			 address.setCity(addressObj.getCity());
			 address.setState(addressObj.getState());
			 address.setCountry(addressObj.getCountry());
		}
		return address;
	}

}
