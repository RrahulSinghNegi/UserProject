package com.user.service.dao;

import com.user.service.bean.User;
import com.user.service.entity.UserEntity;

public interface UserDao {
	public UserEntity addUser(UserEntity user);

	public Iterable<UserEntity> getUser();
}
