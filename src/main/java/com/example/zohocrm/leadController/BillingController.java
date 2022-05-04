package com.example.zohocrm.leadController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.zohocrm.entities.Billing;
import com.example.zohocrm.services.BillingService;

@Controller
public class BillingController {
	@Autowired
	BillingService billingservice;
	
	@RequestMapping("/savebill")
	public String getBill(@ModelAttribute("bill") Billing bill,ModelMap model) {
		
	billingservice.saveBill(bill);
	List<Billing> billingList = billingservice.getBillingList();
	model.addAttribute("billing", billingList);
		return "bill_result";	}
	@RequestMapping("billList")
	public String getBillList(ModelMap model) {
		List<Billing> billingList = billingservice.getBillingList();
		model.addAttribute("billing", billingList);
			return "bill_result";	}
	
	
	@RequestMapping("/getBillId")
	public String getBillById(@RequestParam("id") long id,ModelMap model) {
		Billing bill = billingservice.getbillById(id);
		model.addAttribute("bill", bill);
		 return "bill_info";
	}
	
	
	
	
	}


