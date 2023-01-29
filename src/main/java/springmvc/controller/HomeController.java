package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is a home URL");
		
		model.addAttribute("name", "Anuradha");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("This is a not a about page. This is an about URL");
		
		model.addAttribute("name", "Anurag Mukherjee");
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("This is help page");
		
		ModelAndView modelAndView = new ModelAndView();
		
		
		//Setting the data
		modelAndView.addObject("name", "My name is Davison");
		modelAndView.addObject("roll","114");
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(56);
		li.add(66);
		li.add(96);
		li.add(86);
		
		modelAndView.addObject("marks", li);
		
		// Setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
}
