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
	
	//����
	@RequestMapping("/all")
	public ModelAndView selectAll(){
		ModelAndView mv = new ModelAndView();  //����ModelAndView����
		List<Passenger> passenger = passengerService.selectAll(); //����ѯ����
		mv.addObject("list", passenger); //�Ѳ�ѯ�����Ľ��passenger����ModelAndView������
		mv.setViewName("main"); //��תmainҳ�� ������/WEB-INF/jsp/main.jsp
		return mv;
	}
	
	//ҳ��ͨ����ת����
	@RequestMapping("{page}")
	public String toPage(@PathVariable()String page){
		return page;
	}
	
	//���
	@RequestMapping("/addPassenger")
	public String addPassenger(Passenger passenger){
		return passengerService.addPassenger(passenger) > 0 ? "redirect:all":"add";
	}
	
	//����
	@RequestMapping("/showPassenger")
	public String passengerById(Integer id,Model model){
		Passenger passenger = passengerService.passengerById(id);
		model.addAttribute("pa", passenger);
		return "update";
	}
	
	//�޸�
	@RequestMapping("/updatePassenger")
	public String updatePassenger(Passenger passenger){
		return passengerService.updatePassenger(passenger) > 0?"redirect:all":"update";
	}
	
	//ɾ��
	@RequestMapping("/deletePassenger")
	public String deletePassenger(Integer id){
		return passengerService.deletePassenger(id) >0?"redirect:all":"error";
	}
	
	/*//��id��
	@RequestMapping("/selectID")
	public ModelAndView selectID(Integer id){
		ModelAndView mv = new ModelAndView();  //����ModelAndView����
		List<Passenger> passenger = passengerService.selectID(id);//����ѯ����
		mv.addObject("pa", passenger); //�Ѳ�ѯ�����Ľ��passenger����ModelAndView������
		mv.setViewName("id"); //��תmainҳ�� ������/WEB-INF/jsp/main.jsp
		return mv;
	}*/
	
	/*//��������
	@RequestMapping("/selectName")
	public ModelAndView selectName( String pname){
		ModelAndView mv = new ModelAndView();  //����ModelAndView����
		List<Passenger> passenger = passengerService.selectName(pname);//����ѯ����
		mv.addObject("pa", passenger); //�Ѳ�ѯ�����Ľ��passenger����ModelAndView������
		mv.setViewName("main"); //��תmainҳ�� ������/WEB-INF/jsp/main.jsp
		return mv;
	}*/
	
	//����������
	@RequestMapping("/selectMore")
	public ModelAndView selectMore(String pname, String sex, String flt,String nucleci) {
		ModelAndView mv = new ModelAndView();  //����ModelAndView����
		List<Passenger> passenger = passengerService.selectMore(pname, sex, flt,nucleci);//����ѯ����
		mv.addObject("pa", passenger); //�Ѳ�ѯ�����Ľ��passenger����ModelAndView������
		mv.setViewName("main"); //��תmainҳ�� ������/WEB-INF/jsp/main.jsp
		return mv;
	}

}
