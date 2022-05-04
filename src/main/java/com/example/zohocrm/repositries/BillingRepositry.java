package com.example.zohocrm.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zohocrm.entities.Billing;

public interface BillingRepositry extends JpaRepository<Billing, Long> {

}
