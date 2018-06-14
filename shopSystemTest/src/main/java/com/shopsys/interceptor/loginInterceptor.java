package com.shopsys.interceptor;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.springframework.web.servlet.HandlerInterceptor;  
import org.springframework.web.servlet.ModelAndView;  

//登陆拦截器
public class loginInterceptor implements HandlerInterceptor  {  
    
  private final String ADMINSESSION = "user";  
  //拦截前处理  
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {  
	  request.setCharacterEncoding("UTF-8");
	  Object sessionObj = request.getSession().getAttribute(ADMINSESSION);  
    if(sessionObj!=null) {   
      return true;  
    }   
    response.sendRedirect("login.jsp");  
    return false;  
  }  
  //拦截后处理  
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav) throws Exception { }  
  //全部完成后处理  
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) throws Exception { }  
}  