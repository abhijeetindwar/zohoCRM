package com.example.zohocrm.leadController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.zohocrm.utilies.EmailService;

@Controller
public class EmailController {
	@Autowired
	EmailService emailService;
	@RequestMapping("/email")
	public String email(@RequestParam("emailid")String email,ModelMap model) {
		model.addAttribute("email",email);
		return "compose_email";
	}
	@RequestMapping("/compose")
	public String composeEmail(@RequestParam("to") String to,@RequestParam("subject") String subject,@RequestParam("body") String body) {
		
		emailService.sendSimpleMessage(to, subject, body);
		
		return "compose_email";
	}

}
