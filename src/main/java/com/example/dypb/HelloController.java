package com.example.dypb;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String home(Model model) {
		model.addAttribute("message", "hello world");
		return "index";
	}   

}