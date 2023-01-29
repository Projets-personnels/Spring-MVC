package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model model) {
		model.addAttribute("Header", "Anurag's Form");
	}

	@RequestMapping("/contact")
	public String showForm(Model model) {

		System.out.println("This is contact page");
		
		

		return "contact";
	}
	
	/*

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
							@RequestParam("email") String email, 
							@RequestParam("userName") String userName,
							@RequestParam("password") String password,
							Model model) {
		
		User user = new User();
		
		user.setEmail(email);
		user.setUserName(userName);
		user.setPassword(password);
		
		System.out.println(user);
		
//		System.out.println(userEmail);
//		System.out.println(userName);
//		System.out.println(password);
		
		// Processing the data
		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", password);
		
		
		
		model.addAttribute("user",user);
		
		return "success";
	}


*/
	
	// Using ModelAttribute annotation
	// Better method, less coding
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		
		
		System.out.println(user);
		
		this.userService.createUsers(user);
		
		return "success";
	}
	
	
}
