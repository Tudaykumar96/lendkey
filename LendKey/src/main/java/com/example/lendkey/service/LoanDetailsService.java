package com.example.lendkey.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.lendkey.dao.LoanDetails;
import com.example.lendkey.dto.LoanDetailsDto;
import com.example.lendkey.repository.LoanDetailsRepository;

@Service
public class LoanDetailsService {
	@Autowired
	private LoanDetailsRepository loanRepository;
	
	@Transactional(readOnly = false)
	public LoanDetails saveLoans(LoanDetailsDto dto) {
		
		LoanDetails loanDetails = new LoanDetails();
		
		loanDetails.setLoanNo(Base64.getEncoder().encodeToString(dto.getLoanNo().getBytes()));
		loanDetails.setLoanType(Base64.getEncoder().encodeToString(dto.getLoanType().getBytes()));
		loanDetails.setBankinfo(dto.getBankinfo());
		
		return loanRepository.save(loanDetails);
	}
}
