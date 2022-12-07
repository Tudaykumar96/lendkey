package com.example.lendkey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lendkey.dao.Address;
import com.example.lendkey.dto.AddressDto;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

	public Address save(AddressDto dto);

}
