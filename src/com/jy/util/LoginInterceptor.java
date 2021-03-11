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
		
		//���������ص���URL��ַ
		
		//��ȡuri
		String uri = req.getRequestURI();
		StringBuffer url = req.getRequestURL();
		
		System.out.println(uri);
		System.out.println(url);
		
		//��¼�߼��Ź�
		
		if(uri.contains("login")||uri.contains("register") ||uri.contains("userRegister")){
			return true;
		}
		
		//�û��Ƿ�Ϊ��¼״̬
		User user =(User)req.getSession().getAttribute("user");
		
		if(user!=null){//�û��Ѿ��ǵ�¼״̬
			
			return true;
		}
		else{//�û�Ϊ�ǵ�¼״̬ ͣ���ڵ�¼ҳ��
			req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
		}
		
		return false;
	}
	
}