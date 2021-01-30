package com.Gharam.Counter;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Counter {
	@GetMapping("/")
	public String Home() {
		return "home.jsp";
	}
	@GetMapping("/counter")
	public String counter(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
        Integer count = (Integer) session.getAttribute("count");
		count += 1;
		session.setAttribute("count", count);
		return "counter.jsp";
	}
	
	
	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.removeAttribute("count");
		return "redirect:/counter";
	}
}
