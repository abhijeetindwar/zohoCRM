package com.example.zohocrm.services;

import java.util.List;

import com.example.zohocrm.entities.Contact;


public interface ContactService {
 public void saveContact(Contact contact);

public List<Contact> getContactList();

public Contact getbillById(long id);


}
