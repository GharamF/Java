package com.Gharam.authentication.controllers;
import com.Gharam.authentication.models.User;
import com.Gharam.authentication.services.UserService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
	private final UserService UserService;
	
	public UserController (UserService UserService) {
		this.UserService = UserService;
		}
	
	
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	if (result.hasErrors()) {
    		return "registrationPage.jsp";
    	}
    	User u = UserService.RegisterUser(user);
    	session.setAttribute("UserID", u.getId());
		return "redirect:/home";
    }



    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    		boolean isAuth = UserService.authenticateUser(email, password);
    		if (isAuth) {
    			User u = UserService.findByEmail(email);
    			session.setAttribute("UserID", u.getId());
    			return  "redirect:/home";
    		}else {
    			model.addAttribute("error", "Invalid Credentials");
    			return "loginPage.jsp";
    		}
    }
    

    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
     Long userID=(Long) session.getAttribute("UserID");
     User user= UserService.FindByUserID(userID);
     model.addAttribute("user",user);
     return "homePage.jsp";
    }
    
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/login";
    }
}	

