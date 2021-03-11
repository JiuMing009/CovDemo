package com.jy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.mapper.PassengerMapper;
import com.jy.pojo.Passenger;

@Service
public class PassengerServiceImpl implements PassengerServiceInf {
	
	@Autowired
	private PassengerMapper passengerMapper;

	@Override
	public List<Passenger> selectAll() {
		// TODO Auto-generated method stub
		List<Passenger> passenger = passengerMapper.selectAll();
		return passenger;
	}

	@Override
	public int addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return passengerMapper.addPassenger(passenger);
	}

	@Override
	public Passenger passengerById(Integer id) {
		// TODO Auto-generated method stub
		return passengerMapper.passengerById(id);
	}

	@Override
	public int updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return passengerMapper.updatePassenger(passenger);
	}

	@Override
	public int deletePassenger(Integer id) {
		// TODO Auto-generated method stub
		return passengerMapper.deletePassenger(id);
	}

	/*@Override
	public List<Passenger> selectID(Integer id) {
		// TODO Auto-generated method stub
		List<Passenger> selectId = passengerMapper.selectID(id);
		return selectId;
	}*/


	/*@Override
	public List<Passenger> selectName(String pname) {
		// TODO Auto-generated method stub
		List<Passenger> name = passengerMapper.selectName(pname);
		return name;
	}*/

	@Override
	public List<Passenger> selectMore(String pname, String sex, String flt,String nucleci) {
		// TODO Auto-generated method stub
		List<Passenger> seMore = passengerMapper.selectMore(pname, sex, flt,nucleci);
		return seMore;
	}



	
}
