package com.csv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csv.dto.EmployeeDetails;

@Repository 
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer>{

}
