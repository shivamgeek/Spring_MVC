package com.shivam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
public class loginController {
	
	@RequestMapping("/doLogin")
	String doLogin() {
		System.out.println("Trying to LOGIN!!!!");
		return "loginSuccessPage.jsp";
	}
	
}
