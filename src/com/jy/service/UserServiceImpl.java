package com.jy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jy.mapper.UserMapper;
import com.jy.pojo.User;

@Service
public class UserServiceImpl implements UserServiceInf {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User loginCheck(User user) {
		// TODO Auto-generated method stub
		return userMapper.loginCheck(user);
	}

	@Override
	public void upImg(User user) {
		// TODO Auto-generated method stub
		userMapper.upImg(user);
	}

	@Override
	public int userRegister(User user) {
		// TODO Auto-generated method stub
		return userMapper.userRegister(user);
	}

	@Override
	public User ByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.ByName(name);
	}

}
