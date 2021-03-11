package com.jy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jy.pojo.Passenger;

public interface PassengerServiceInf {
	
	//ȫ��
	public List<Passenger> selectAll();
	
	//���
	public int addPassenger(Passenger passenger);
	
	//����
	public Passenger passengerById(Integer id);
		
	//�༭
	public int updatePassenger(Passenger passenger);
		
	//ɾ��
	public int deletePassenger(Integer id);
	
	/*//��id��
	public List<Passenger> selectID(Integer id);*/
	
	/*//��������
	public List<Passenger> selectName(String pname);*/
	
	//��������ѯ
	public List<Passenger> selectMore(String pname,String sex,String flt,String nucleci);
}
