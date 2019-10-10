package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.FinancialAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FinancialAccountRepository extends JpaRepository <FinancialAccount, Integer> {

}
