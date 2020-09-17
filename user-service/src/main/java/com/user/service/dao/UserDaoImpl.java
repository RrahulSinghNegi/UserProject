package com.user.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.user.service.entity.UserEntity;
import com.user.service.repository.UserRepository;
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	UserRepository userRepository;
	
	public UserEntity addUser(UserEntity user) {
		return userRepository.save(user);
	}

	public Iterable<UserEntity> getUser() {
		return userRepository.findAll();
	}

}
