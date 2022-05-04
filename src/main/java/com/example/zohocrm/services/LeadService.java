package com.example.zohocrm.services;

import java.util.List;

import com.example.zohocrm.entities.Lead;

public interface LeadService {
 public void saveLead(Lead lead);

public List<Lead> getLeadsList();

public Lead getById(Long id);

public void deleteById(long id);
}
