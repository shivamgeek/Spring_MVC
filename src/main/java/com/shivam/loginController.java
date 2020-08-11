package com.shivam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 @Controller
public class loginController {
	
	@RequestMapping("/doLogin")
	ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Trying to LOGIN!!!!");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ModelAndView mv = new ModelAndView();
		
		if(password.equals("s") == true) {
			mv.setViewName("loginSuccessPage.jsp");
			mv.addObject("username",username);
		}else {
			mv.setViewName("loginFailure.jsp");
			mv.addObject("username",username);
		}

		
		return mv;
	}
	
}
