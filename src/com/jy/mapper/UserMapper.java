package com.jy.mapper;

import com.jy.pojo.User;

public interface UserMapper {
	
	//登录
	public  User loginCheck(User user);
	
	//头像
	public void upImg(User user);
	
	//注册
	public int userRegister(User user);
	
	//个人信息
	public User ByName(String name);

}
