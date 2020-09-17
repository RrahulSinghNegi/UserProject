package com.user.service.dao;

import com.user.service.entity.AddressEntity;

public interface AddressDao {
	public AddressEntity addAddress(AddressEntity address);

	public Iterable<AddressEntity> getAddress();
}
