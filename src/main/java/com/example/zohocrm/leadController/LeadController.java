package com.example.zohocrm.leadController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.zohocrm.entities.Contact;
import com.example.zohocrm.entities.Lead;
import com.example.zohocrm.services.ContactService;
import com.example.zohocrm.services.LeadService;

@Controller
public class LeadController {
	@Autowired
	LeadService service;
	@Autowired
	ContactService contactservice;
	@RequestMapping("/view")
	public String viewLead() {
		return "create_lead";
	}
	
	@RequestMapping("/save")
	public String saveLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		service.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/listAll")
	public String leadsList(ModelMap model) {
		List<Lead> leads=service.getLeadsList();
		model.addAttribute("leads", leads);
		return "leads_result";
	}
	@RequestMapping("/get")
	public String getById(@RequestParam("id") long id,ModelMap model) {
		Lead lead=service.getById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/convert")
	public String convert(@RequestParam("id") long id,ModelMap model) {
		Lead lead=service.getById(id);
		
		Contact contact=new Contact();
		contact.setId(lead.getId());
		contact.setEmail(lead.getEmail());
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactservice.saveContact(contact);
		service.deleteById(id);
		List<Contact> contacts = contactservice.getContactList();
		model.addAttribute("contacts", contacts);
		return "contacts_result";
	}
	
}
