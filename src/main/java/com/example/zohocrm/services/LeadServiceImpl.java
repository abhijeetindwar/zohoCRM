package com.example.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zohocrm.entities.Lead;
import com.example.zohocrm.repositries.LeadRepositry;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	LeadRepositry leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
 
	}

	@Override
	public List<Lead> getLeadsList() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getById(Long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
		
	}

	
}
