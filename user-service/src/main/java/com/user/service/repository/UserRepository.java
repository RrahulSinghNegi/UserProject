package com.user.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.user.service.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{

}
