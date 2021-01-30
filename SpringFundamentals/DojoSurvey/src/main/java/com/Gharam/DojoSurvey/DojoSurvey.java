package com.Gharam.DojoSurvey;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class DojoSurvey {
	@RequestMapping("/")
	public String survey() {
		return "index.jsp";
	}
	@RequestMapping(value ="/Display" , method=RequestMethod.POST)
	public String result(@RequestParam(value="name") String name, @RequestParam(value="location") String location, 
			@RequestParam(value="language") String language, 
			@RequestParam(value="comment") String comment, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "results.jsp";
	}
	
}
