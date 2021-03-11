package com.jy.pojo;

import org.springframework.web.multipart.MultipartFile;

public class User {
	private Integer id;
	private String name;
	private String password;
	private String image;
	private MultipartFile file;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String password, String image, MultipartFile file) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.image = image;
		this.file = file;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
	
	
	
}
