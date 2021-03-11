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
	
	//页面通用跳转方法
	@RequestMapping("{page}")
	public String toPage(@PathVariable()String page){
		return page;
	}
	
	//登录
	@RequestMapping("/loginCheck")
	public ModelAndView loginCheck(User user,HttpSession session){
		session.setAttribute("name",user.getName());
		ModelAndView mv = new ModelAndView();  //创建ModelAndView对象
		User u = userService.loginCheck(user); //调用service层登录方法
			
		if(u!=null){
			session.setAttribute("user", u); //把查询出来的user对象存入session中
			mv.setViewName("redirect:../Passenger/home");
		}
		else{
				//登录失败停留在登录页面
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
		ModelAndView mv = new ModelAndView();  //创建ModelAndView对象
      //保存数据库的路径  
      String sqlPath = null;   
      //定义文件保存的本地路径  
      String localPath="D:\\image\\";  
      //定义 文件名  
      String filename=null;    
      if(!user.getFile().isEmpty()){    
          //生成uuid作为文件名称    
          String uuid = UUID.randomUUID().toString().replaceAll("-","");    
          //获得文件类型（可以判断如果不是图片，禁止上传）    
          String contentType=user.getFile().getContentType();    
          //获得文件后缀名   
          String suffixName=contentType.substring(contentType.indexOf("/")+1);  
          //得到 文件名  
          filename=uuid+"."+suffixName;   
          System.out.println(filename);  
          //文件保存路径  
          user.getFile().transferTo(new File(localPath+filename));    
      }  
      //把图片的相对路径保存至数据库  
      sqlPath = "/images/"+filename;  
      System.out.println(sqlPath);  
      user.setImage(sqlPath);
      
      userService.upImg(user);
      mv.addObject(user);
      mv.setViewName("image");
      return mv;  
    }  
	
	
	//注销
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute("user");
			return "login";
		}
	
	//注册
	@RequestMapping("/userRegister")
	public String userRegister(User user,HttpSession session){
		session.setAttribute("name", user.getName());
		return userService.userRegister(user) > 0? "login":"register";
	}
	
	//回显
	@RequestMapping("/showUser")
	public String ByName(String name,Model model){
			User user = userService.ByName(name);
			model.addAttribute("user", user);
			return "userup";
		}

}
