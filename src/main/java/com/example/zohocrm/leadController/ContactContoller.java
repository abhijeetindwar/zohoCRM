package com.example.zohocrm.leadController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.zohocrm.entities.Contact;
import com.example.zohocrm.services.ContactService;

@Controller
public class ContactContoller {
	@Autowired
	ContactService contactservice;
	@RequestMapping("/contactList")
    public String contacts(ModelMap model) {
		List<Contact> contacts = contactservice.getContactList();
		model.addAttribute("contacts", contacts);
    	return "contacts_result";
    }
@RequestMapping("getbill")
public String getBill(@RequestParam("id") long id,ModelMap model) {
	Contact contacts=contactservice.getbillById(id);
	
	model.addAttribute("contacts", contacts);
	return "billing_contact";
}
}
