package com.shopsys.interceptor;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.springframework.web.servlet.HandlerInterceptor;  
import org.springframework.web.servlet.ModelAndView;  

//��½������
public class loginInterceptor implements HandlerInterceptor  {  
    
  private final String ADMINSESSION = "user";  
  //����ǰ����  
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {  
	  request.setCharacterEncoding("UTF-8");
	  Object sessionObj = request.getSession().getAttribute(ADMINSESSION);  
    if(sessionObj!=null) {   
      return true;  
    }   
    response.sendRedirect("login.jsp");  
    return false;  
  }  
  //���غ���  
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav) throws Exception { }  
  //ȫ����ɺ���  
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) throws Exception { }  
}  