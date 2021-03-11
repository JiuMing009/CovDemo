package com.jy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jy.pojo.Passenger;

public interface PassengerMapper {
	
	//全查
	public List<Passenger> selectAll(); 
	
	//添加
	public int addPassenger(Passenger passenger);
	
	//回显
	public Passenger passengerById(Integer id);
	
	//编辑
	public int updatePassenger(Passenger passenger);
	
	//删除
	public int deletePassenger(Integer id);
	
	/*//按id查
	public List<Passenger> selectID(Integer id);*/
	
	/*//按姓名查
	public List<Passenger> selectName(String pname);*/
	
	//多条件查询
	public List<Passenger> selectMore(@Param("pname")String pname,@Param("sex")String sex,@Param("flt")String flt,@Param("nucleci")String nucleci);

}
