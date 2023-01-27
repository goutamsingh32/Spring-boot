package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
//	@RequestMapping("Home")
//	public String home() {
//		System.out.println("hi");
//		return "Home";
//	}
	
	
	
//	@RequestMapping("Home")
//	public String home(HttpServletRequest req) {
//		
//		String name = req.getParameter("name");
//		System.out.println("hi  " + name);
//		req.setAttribute("name", name);
//		return "Home";
//	}

	
	
	
//	@RequestMapping("Home")
//	public String home(HttpServletRequest req) {
//		HttpSession session = req.getSession();
//		
//		String name = req.getParameter("name");
//		System.out.println("hi  " + name);
//		session.setAttribute("name", name);	
//		return "Home";
//	}
	
	
//	@RequestMapping("Home")
//	public String home(String name,HttpSession session) {
//			
//		System.out.println("hi  " + name);
//		session.setAttribute("name", name);	
//		return "Home";
//	}
//	public String home(@RequestParam("name") String myName,HttpSession session) {
//		
//		System.out.println("hi  " + myName);
//		session.setAttribute("name", myName);	
//		return "Home";
//	}
	
//	@RequestMapping("Home")
//	public ModelAndView home(@RequestParam("name") String myName) {
//		
//		ModelAndView mv = new ModelAndView();
//		
//		mv.addObject("name",myName);
//		mv.setViewName("Home");
//		System.out.println("hi  " + myName);
//		return mv;
//	}
	
	@RequestMapping("Home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj" ,alien);
		mv.setViewName("Home");
		return mv;
	}

	
}
