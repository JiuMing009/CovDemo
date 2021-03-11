package com.jy.pojo;

import java.util.Date;

public class Passenger {
	private Integer id;
	private String pname;
	private Integer age;
	private String sex;
	private String flt;
	private String nucleci;
	private Date time;
	private double temperature;
	private String vaccine;
	
	
	//alt+shift+s
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Passenger(Integer id, String pname, Integer age, String sex, String flt, String nucleci, Date time,
			double temperature, String vaccine) {
		super();
		this.id = id;
		this.pname = pname;
		this.age = age;
		this.sex = sex;
		this.flt = flt;
		this.nucleci = nucleci;
		this.time = time;
		this.temperature = temperature;
		this.vaccine = vaccine;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getFlt() {
		return flt;
	}


	public void setFlt(String flt) {
		this.flt = flt;
	}


	public String getNucleci() {
		return nucleci;
	}


	public void setNucleci(String nucleci) {
		this.nucleci = nucleci;
	}


	public Date getTime() {
		return time;
	}


	public void setTime(Date time) {
		this.time = time;
	}


	public double getTemperature() {
		return temperature;
	}


	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}


	public String getVaccine() {
		return vaccine;
	}


	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	
}
