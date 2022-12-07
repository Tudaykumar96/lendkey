package com.example.lendkey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lendkey.dao.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
}
