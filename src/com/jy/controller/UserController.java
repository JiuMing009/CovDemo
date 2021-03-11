package com.jy.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jy.pojo.Passenger;
import com.jy.pojo.User;
import com.jy.service.UserServiceInf;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserServiceInf userService;
	
	//ҳ��ͨ����ת����
	@RequestMapping("{page}")
	public String toPage(@PathVariable()String page){
		return page;
	}
	
	//��¼
	@RequestMapping("/loginCheck")
	public ModelAndView loginCheck(User user,HttpSession session){
		session.setAttribute("name",user.getName());
		ModelAndView mv = new ModelAndView();  //����ModelAndView����
		User u = userService.loginCheck(user); //����service���¼����
			
		if(u!=null){
			session.setAttribute("user", u); //�Ѳ�ѯ������user�������session��
			mv.setViewName("redirect:../Passenger/home");
		}
		else{
				//��¼ʧ��ͣ���ڵ�¼ҳ��
			mv.setViewName("login");
		}
		return mv;
	}
	
	/*@RequestMapping("/upImg")
	public String upImg(User user,HttpServletRequest request,Model model) throws Exception{
		String sqlPath = null;
		String localPath="D:\\image\\";
		String filename = null;
		if(!user.getFile().isEmpty()){
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			String contentType=user.getFile().getContentType();
			
			String suffixName = contentType.substring(contentType.indexOf("/")+1);
			
			filename = uuid+"."+suffixName;
			
			user.getFile().transferTo(new File(localPath+filename));
		}
		
		sqlPath ="/images/"+filename;
		user.setImage(sqlPath);
		userService.upImg(user);
		model.addAttribute("user",user);
		
		return "imageup";*/
	
	@RequestMapping("/upImg")  
    public ModelAndView upImg(User user,HttpServletRequest request) throws Exception{  
		ModelAndView mv = new ModelAndView();  //����ModelAndView����
      //�������ݿ��·��  
      String sqlPath = null;   
      //�����ļ�����ı���·��  
      String localPath="D:\\image\\";  
      //���� �ļ���  
      String filename=null;    
      if(!user.getFile().isEmpty()){    
          //����uuid��Ϊ�ļ�����    
          String uuid = UUID.randomUUID().toString().replaceAll("-","");    
          //����ļ����ͣ������ж��������ͼƬ����ֹ�ϴ���    
          String contentType=user.getFile().getContentType();    
          //����ļ���׺��   
          String suffixName=contentType.substring(contentType.indexOf("/")+1);  
          //�õ� �ļ���  
          filename=uuid+"."+suffixName;   
          System.out.println(filename);  
          //�ļ�����·��  
          user.getFile().transferTo(new File(localPath+filename));    
      }  
      //��ͼƬ�����·�����������ݿ�  
      sqlPath = "/images/"+filename;  
      System.out.println(sqlPath);  
      user.setImage(sqlPath);
      
      userService.upImg(user);
      mv.addObject(user);
      mv.setViewName("image");
      return mv;  
    }  
	
	
	//ע��
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute("user");
			return "login";
		}
	
	//ע��
	@RequestMapping("/userRegister")
	public String userRegister(User user,HttpSession session){
		session.setAttribute("name", user.getName());
		return userService.userRegister(user) > 0? "login":"register";
	}
	
	//����
	@RequestMapping("/showUser")
	public String ByName(String name,Model model){
			User user = userService.ByName(name);
			model.addAttribute("user", user);
			return "userup";
		}

}
