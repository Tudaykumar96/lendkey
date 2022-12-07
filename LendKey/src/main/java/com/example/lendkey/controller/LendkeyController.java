package com.example.lendkey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lendkey.dao.Address;
import com.example.lendkey.dao.BankInfo;
import com.example.lendkey.dao.Customer;
import com.example.lendkey.dao.LoanDetails;
import com.example.lendkey.dto.AddressDto;
import com.example.lendkey.dto.BankInfoDto;
import com.example.lendkey.dto.CustomerDto;
import com.example.lendkey.dto.LoanDetailsDto;
import com.example.lendkey.service.AddressService;
import com.example.lendkey.service.BankInfoService;
import com.example.lendkey.service.CustomerService;
import com.example.lendkey.service.LoanDetailsService;

@RestController
public class LendkeyController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private BankInfoService bankInfoService;
	@Autowired
	private AddressService addressService;
	@Autowired
	private LoanDetailsService loanService;
	
	CustomerDto dto = null;
	
	@PostMapping("/save")
	public Customer save(@RequestBody CustomerDto customerdto) {
		
		CustomerDto dto = new CustomerDto();
		
		//dto.setCustomerId(customerdto.getCustomerId());
		
		dto.setFirstName(customerdto.getFirstName());
		dto.setLastName(customerdto.getLastName());
		dto.setEmail(customerdto.getEmail());
		dto.setMobileNo(customerdto.getMobileNo());
		dto.setUserType(customerdto.getUserType());
		dto.setAddress(customerdto.getAddress());
		
		return customerService.addCustomer(dto);
		
	}
	

	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody AddressDto addressDto) {
		AddressDto dto = new AddressDto();
		
		dto.setAddressLine1(addressDto.getAddressLine1());
		dto.setAddressLine2(addressDto.getAddressLine2());
		dto.setCity(addressDto.getCity());
		dto.setState(addressDto.getState());
		dto.setZipCode(addressDto.getZipCode());
		dto.setCountry(addressDto.getCountry());

		return addressService.saveAdd(dto);
	}
	
	
	@PostMapping("/addBank")
	public BankInfo addBank(@RequestBody BankInfoDto dto) {
		
		BankInfoDto infoDto = new BankInfoDto();
		
		infoDto.setAccountNo(dto.getAccountNo());
		infoDto.setAccountHolderName(dto.getAccountNo());
		infoDto.setAccountType(dto.getAccountNo());
		infoDto.setCustomer(dto.getCustomer());
		
		return bankInfoService.saveBankInfo(infoDto); 
	}
	
	@PostMapping("/addloans")
	public LoanDetails addLoanDetails(@RequestBody LoanDetailsDto loandto) {
		
		LoanDetailsDto loansDto = new LoanDetailsDto();
		
		//loansDto.setLoanId(dto.getLoanId());
		loansDto.setLoanNo(loandto.getLoanNo());
		loansDto.setLoanType(loandto.getLoanType());
		loansDto.setBankinfo(loandto.getBankinfo());
		
		return loanService.saveLoans(loansDto);
		
	}
	
}
