package com.example.lendkey.dto;

import java.util.List;

import com.example.lendkey.dao.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BankInfoDto {
	private int accountSequenceNo;
	private String accountNo;
	private String accountHolderName;
	private String accountType;
	private List<Customer> customer;

	public int getAccountSequenceNo() {
		return accountSequenceNo;
	}

	public void setAccountSequenceNo(int accountSequenceNo) {
		this.accountSequenceNo = accountSequenceNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

}
