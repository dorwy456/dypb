package com.example.login.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.service.LoginService;
import com.example.login.vo.User;

import io.swagger.annotations.ApiOperation;

@RestController  
@CrossOrigin(origins = "*")
public class HelloController {
	
   @Autowired
    LoginService loginService;

	@ApiOperation(value = "login")
	@RequestMapping("/login.do")
	public String home(Model model) throws Exception {
		List<User> result = loginService.getAll();
		if(result.size() > 0) {
			model.addAttribute("message", "Success");
		}else {
			model.addAttribute("message", "Fail");
		}
		return model.getAttribute("message").toString();
	}   

} 