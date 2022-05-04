package com.example.zohocrm.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zohocrm.entities.Lead;

public interface LeadRepositry extends JpaRepository<Lead, Long> {

}
