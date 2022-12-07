package com.example.lendkey.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bank_info")
public class BankInfo {
	@Id
	@Column(name = "bank_info_no")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int bankSequenceNo;
	@Column(name = "acc_no")
	private String accountNo;
	@Column(name = "acc_hld_nm")
	private String accountHolderName;
	@Column(name = "acc_type")
	private String accountType;

	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "bank_info_no")
	private List<Customer> customer;

	public int getBankSequenceNo() {
		return bankSequenceNo;
	}

	public void setBankSequenceNo(int bankSequenceNo) {
		this.bankSequenceNo = bankSequenceNo;
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
