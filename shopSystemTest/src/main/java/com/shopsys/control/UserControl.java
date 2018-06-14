package com.shopsys.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopsys.entity.User;
import com.shopsys.service.UserService;

@Controller
public class UserControl {
	@Autowired
	private UserService service;
	
	/**
	 * µÇÂ½
	 * @param u
	 * @param request
	 * @return
	 */
	@RequestMapping("sys/login.do")
	public String login(User u,HttpServletRequest request) {
		HttpSession session=request.getSession();
		boolean loginType=service.login(u.getUsername(), u.getPassword());
		if(loginType) {
			session.setAttribute("user", u);
			return "redirect:/sys/main.html";
		}else {
			session.setAttribute("message","µÇÂ½Ê§°Ü,ÓÃ»§ÃûÃÜÂë´íÎó");
			return "sys/error";
		}
	}
	/**
	 * ÍË³ö
	 * @param request
	 * @return
	 */
	@RequestMapping("sys/exit.do")
	public String unLogin(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		request.getSession().invalidate();
		return "sys/login";
	}

}
