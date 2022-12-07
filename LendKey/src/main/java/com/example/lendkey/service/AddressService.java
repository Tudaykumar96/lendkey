package com.example.lendkey.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lendkey.dao.Address;
import com.example.lendkey.dto.AddressDto;
import com.example.lendkey.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;
	
	@org.springframework.transaction.annotation.Transactional(readOnly=false)

	public Address saveAdd(AddressDto dto) {
		Address address = null;
		address = new Address();
		
		address.setAddressLine1(Base64.getEncoder().encodeToString(dto.getAddressLine1().getBytes()));
		address.setAddressline2(Base64.getEncoder().encodeToString(dto.getAddressLine2().getBytes()));
		address.setCity(Base64.getEncoder().encodeToString(dto.getCity().getBytes()));
		address.setState(Base64.getEncoder().encodeToString(dto.getState().getBytes()));
		address.setZipCode(Base64.getEncoder().encodeToString(dto.getZipCode().getBytes()));
		address.setCountry(Base64.getEncoder().encodeToString(dto.getCountry().getBytes()));
		
		return addressRepository.save(address);
	}
}
