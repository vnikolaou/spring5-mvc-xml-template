package com.pionware.starter.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping("/main.html")
	public String pageGenerate(){
		
		String content = "<html>"
				+ "" + "<head><title>MVC Web</title></head>"
				+ "" + "<body>This is Spring MVC Web</body>"
				+ "" + "</html>"
				+ "";
		
		return content;
	}
	
	@RequestMapping("/intro.html")
	public String introPage(){
		return "intro";
	}
	
	@RequestMapping("/welcome.html")
	public String welcomePage(){
		return "welcome";
	}

}
