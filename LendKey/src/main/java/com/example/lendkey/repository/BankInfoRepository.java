package com.example.lendkey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lendkey.dao.BankInfo;

@Repository
public interface BankInfoRepository extends JpaRepository<BankInfo, Integer> {

}
