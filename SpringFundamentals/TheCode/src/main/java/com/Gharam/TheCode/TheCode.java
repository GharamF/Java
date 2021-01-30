package com.Gharam.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TheCode {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping(value ="/TheCode", method=RequestMethod.POST)
	public String code(@RequestParam(value="code") String code,RedirectAttributes redirectAttributes) {
		if(!code.equals("bushido")) {
			  redirectAttributes.addFlashAttribute("error", "You Must Train Harder!");
		        return "redirect:/";
		}
		return "code.jsp";
	}
	
}
