package com.example.zohocrm.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zohocrm.entities.Contact;
import com.example.zohocrm.repositries.ContactRepositry;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	ContactRepositry contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
 
	}

	@Override
	public List<Contact> getContactList() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getbillById(long id) {
		Contact bill = contactRepo.getById(id);
		return bill;
	}



	
}
