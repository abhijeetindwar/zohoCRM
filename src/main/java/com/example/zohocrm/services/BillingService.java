package com.example.zohocrm.services;

import java.util.List;

import com.example.zohocrm.entities.Billing;



public interface BillingService {
 public void saveBill(Billing bill);

public List<Billing> getBillingList();

public Billing getbillById(long id);


}
