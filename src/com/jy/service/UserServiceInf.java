package com.jy.service;

import com.jy.pojo.User;

public interface UserServiceInf {
	
	//��¼
	public  User loginCheck(User user);

	//ͷ��
	public void upImg(User user);
	
	//ע��
	public int userRegister(User user);
	
	//������Ϣ
	public User ByName(String name);
}
