package com.example.lendkey.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.lendkey.dao.BankInfo;
import com.example.lendkey.dto.BankInfoDto;
import com.example.lendkey.repository.BankInfoRepository;

@Service
public class BankInfoService {
	@Autowired
	private BankInfoRepository bankInfoRepository;
	
	@Transactional(readOnly = false)
	public BankInfo saveBankInfo(BankInfoDto bankInfoDto) {
		
		BankInfo bankinfo = new BankInfo();
		
		bankinfo.setAccountNo(Base64.getEncoder().encodeToString(bankInfoDto.getAccountNo().getBytes()));
		bankinfo.setAccountHolderName(Base64.getEncoder().encodeToString(bankInfoDto.getAccountHolderName().getBytes()));
		bankinfo.setAccountType(Base64.getEncoder().encodeToString(bankInfoDto.getAccountType().getBytes()));
		bankinfo.setCustomer(bankInfoDto.getCustomer());
		
		return bankInfoRepository.save(bankinfo);
	}
}
