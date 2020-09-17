package com.user.service.repositories;

import org.springframework.data.repository.CrudRepository;

import com.user.service.entity.AddressEntity;

public interface AddressRepositories extends CrudRepository<AddressEntity, Integer> {

}
