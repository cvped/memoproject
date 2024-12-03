package com.cvped.memo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {


	@GetMapping("/user/join-view")
	public String inputJoin() {
		return "user/join";
	}
	
	
	@GetMapping("/user/login-view")
	public String inputLogin(){
		return "/user/login";
	}
}
