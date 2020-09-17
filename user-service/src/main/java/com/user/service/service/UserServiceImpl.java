package com.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.bean.User;
import com.user.service.dao.UserDao;
import com.user.service.entity.UserEntity;
@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	public UserEntity addUser(UserEntity user) {
		return userDao.addUser(user);
	}
	public User getUser() {
		User usr = new User();
		for(UserEntity userEntity: userDao.getUser()){
			usr.setName(userEntity.getName());
			usr.setEmail(userEntity.getEmail());
		}
		return usr;
	}

}
