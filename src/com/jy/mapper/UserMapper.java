package com.jy.mapper;

import com.jy.pojo.User;

public interface UserMapper {
	
	//��¼
	public  User loginCheck(User user);
	
	//ͷ��
	public void upImg(User user);
	
	//ע��
	public int userRegister(User user);
	
	//������Ϣ
	public User ByName(String name);

}
