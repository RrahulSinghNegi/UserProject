package com.user.service.service;

import com.user.service.bean.Address;
import com.user.service.entity.AddressEntity;

public interface AddressService {
	public AddressEntity addAddress(AddressEntity address);

	public Address getAddress();
}
