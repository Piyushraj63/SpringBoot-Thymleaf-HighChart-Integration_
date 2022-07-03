package com.pi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pi.model.GraphChanger;
import com.pi.model.User;

@Controller
public class HChartController {
   
	
	 
	
	@GetMapping("/")
	public String hg1(Model model,HttpServletRequest request,HttpServletResponse response) {
        
		  // return "switch-case";
		  
		  if(request.getParameter("ADMIN")!=null) {
			  User user = new User("PIYUSH", "ADMIN");
			  model.addAttribute("user", user);
		  }else if(request.getParameter("MANAGER")!=null) {
			  User user = new User("PIYUSH", "MANAGER");
			  model.addAttribute("user", user);
		  }else if(request.getParameter("GUEST")!=null) {
			  User user = new User("PIYUSH", "GUEST");
			  model.addAttribute("user", user);
		  }else {
			  User user = new User("PIYUSH", "Rock");
			  model.addAttribute("user", user);
		  }
		  return "index1";
		  
	}
}
