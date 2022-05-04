package com.example.zohocrm.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zohocrm.entities.Billing;

import com.example.zohocrm.repositries.BillingRepositry;


@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	BillingRepositry billingRepo;

	@Override
	public void saveBill(Billing billing) {
		billingRepo.save(billing);
 
	}

	@Override
	public List<Billing> getBillingList() {
		List<Billing> bills = billingRepo.findAll();
		return bills;
	}

	@Override
	public Billing getbillById(long id) {
		Billing bill = billingRepo.getById(id);
		return bill;
	}



	
}
