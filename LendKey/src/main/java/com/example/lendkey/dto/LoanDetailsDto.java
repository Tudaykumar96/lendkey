package com.example.lendkey.dto;

import java.util.List;

import com.example.lendkey.dao.BankInfo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoanDetailsDto {
	private int loanId;
	private String loanNo;
	private String loanType;
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
