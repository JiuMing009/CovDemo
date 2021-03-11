package com.jy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.jy.pojo.Passenger;
import com.jy.service.PassengerServiceInf;

@Controller
@RequestMapping("/Passenger")
public class PassengerController {
	
	@Autowired
	private PassengerServiceInf passengerService;
	
	//创建
	@RequestMapping("/all")
	public ModelAndView selectAll(){
		ModelAndView mv = new ModelAndView();  //创建ModelAndView对象
		List<Passenger> passenger = passengerService.selectAll(); //做查询工作
		mv.addObject("list", passenger); //把查询出来的结果passenger存入ModelAndView对象中
		mv.setViewName("main"); //跳转main页面 本质是/WEB-INF/jsp/main.jsp
		return mv;
	}
	
	//页面通用跳转方法
	@RequestMapping("{page}")
	public String toPage(@PathVariable()String page){
		return page;
	}
	
	//添加
	@RequestMapping("/addPassenger")
	public String addPassenger(Passenger passenger){
		return passengerService.addPassenger(passenger) > 0 ? "redirect:all":"add";
	}
	
	//回显
	@RequestMapping("/showPassenger")
	public String passengerById(Integer id,Model model){
		Passenger passenger = passengerService.passengerById(id);
		model.addAttribute("pa", passenger);
		return "update";
	}
	
	//修改
	@RequestMapping("/updatePassenger")
	public String updatePassenger(Passenger passenger){
		return passengerService.updatePassenger(passenger) > 0?"redirect:all":"update";
	}
	
	//删除
	@RequestMapping("/deletePassenger")
	public String deletePassenger(Integer id){
		return passengerService.deletePassenger(id) >0?"redirect:all":"error";
	}
	
	/*//按id查
	@RequestMapping("/selectID")
	public ModelAndView selectID(Integer id){
		ModelAndView mv = new ModelAndView();  //创建ModelAndView对象
		List<Passenger> passenger = passengerService.selectID(id);//做查询工作
		mv.addObject("pa", passenger); //把查询出来的结果passenger存入ModelAndView对象中
		mv.setViewName("id"); //跳转main页面 本质是/WEB-INF/jsp/main.jsp
		return mv;
	}*/
	
	/*//按姓名查
	@RequestMapping("/selectName")
	public ModelAndView selectName( String pname){
		ModelAndView mv = new ModelAndView();  //创建ModelAndView对象
		List<Passenger> passenger = passengerService.selectName(pname);//做查询工作
		mv.addObject("pa", passenger); //把查询出来的结果passenger存入ModelAndView对象中
		mv.setViewName("main"); //跳转main页面 本质是/WEB-INF/jsp/main.jsp
		return mv;
	}*/
	
	//按多条件查
	@RequestMapping("/selectMore")
	public ModelAndView selectMore(String pname, String sex, String flt,String nucleci) {
		ModelAndView mv = new ModelAndView();  //创建ModelAndView对象
		List<Passenger> passenger = passengerService.selectMore(pname, sex, flt,nucleci);//做查询工作
		mv.addObject("pa", passenger); //把查询出来的结果passenger存入ModelAndView对象中
		mv.setViewName("main"); //跳转main页面 本质是/WEB-INF/jsp/main.jsp
		return mv;
	}

}
