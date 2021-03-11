package com.jy.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.jy.pojo.User;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		
		//拦截器拦截的是URL地址
		
		//获取uri
		String uri = req.getRequestURI();
		StringBuffer url = req.getRequestURL();
		
		System.out.println(uri);
		System.out.println(url);
		
		//登录逻辑放过
		
		if(uri.contains("login")||uri.contains("register") ||uri.contains("userRegister")){
			return true;
		}
		
		//用户是否为登录状态
		User user =(User)req.getSession().getAttribute("user");
		
		if(user!=null){//用户已经是登录状态
			
			return true;
		}
		else{//用户为非登录状态 停留在登录页面
			req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
		}
		
		return false;
	}
	
}