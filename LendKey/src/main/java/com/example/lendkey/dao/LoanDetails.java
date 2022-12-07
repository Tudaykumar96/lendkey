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
@Table(name = "loan_details")
public class LoanDetails {
	@Id
	@Column(name = "loan_id")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int loanId;
	@Column(name = "loan_no")
	private String loanNo;
	@Column(name = "loan_type")
	private String loanType;

	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "loan_id")
	private List<BankInfo> bankinfo;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public List<BankInfo> getBankinfo() {
		return bankinfo;
	}

	public void setBankinfo(List<BankInfo> bankinfo) {
		this.bankinfo = bankinfo;
	}

}
