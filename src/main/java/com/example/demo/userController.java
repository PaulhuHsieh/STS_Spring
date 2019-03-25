package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.UserService;

//import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@Controller
public class userController {
	
	@Autowired
	UserService userService;

	 @GetMapping("/")
		public String index(Map<String, Object> model) {
		 	model.put("ID", userService.getUserId());
			return "index";
		}
	 
	/*
	private String message = "鐵人賽第七天加油!!!";
	 
	 @GetMapping("/")
		public String index(Map<String, Object> model) {
			model.put("message", this.message);
			return "index"; //index name need to be the same as index.jsp if return day , jsp file name is day.jsp
	}// jsp file is in  src/main/webapp/WEB-INF/jsp/ (here)  */   
	
	/*
	 @RequestMapping("/MyFirstPage")
	    public String greeting(@RequestParam(value="title", required=false, 
	    defaultValue="xiao") String title, Model model) {
	        model.addAttribute("name", title);
	        return "index";
	    }//
	 */
	  
}