package com.example.zohocrm.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zohocrm.entities.Contact;


public interface ContactRepositry extends JpaRepository<Contact, Long> {

}
