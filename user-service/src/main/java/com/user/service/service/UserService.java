package com.user.service.service;

import com.user.service.bean.User;
import com.user.service.entity.UserEntity;

public interface UserService {

	public UserEntity addUser(UserEntity user);

	public User getUser();
}
