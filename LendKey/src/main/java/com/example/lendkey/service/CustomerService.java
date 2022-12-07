package com.example.lendkey.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lendkey.dao.Customer;
import com.example.lendkey.dto.CustomerDto;
import com.example.lendkey.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@org.springframework.transaction.annotation.Transactional(readOnly=false)
	public Customer addCustomer(CustomerDto dto) {
		Customer customer = null;
		
		customer = new Customer();
		customer.setFirstName(Base64.getEncoder().encodeToString(dto.getFirstName().getBytes()));
		customer.setLastName(Base64.getEncoder().encodeToString(dto.getLastName().getBytes()));
		customer.setEmail(Base64.getEncoder().encodeToString(dto.getEmail().getBytes()));
		customer.setMobileNo(Base64.getEncoder().encodeToString(dto.getMobileNo().getBytes()));
		customer.setUserType(Base64.getEncoder().encodeToString(dto.getMobileNo().getBytes()));
		customer.setAddress(dto.getAddress());

		return customerRepository.save(customer);
	}
}
