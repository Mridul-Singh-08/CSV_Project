package com.csv.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csv.dto.EmployeeDetails;
import com.csv.exception.EmployeeDetailsException;
import com.csv.service.EmployeeDetailsServiseImp;


@RestController
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailsServiseImp eds;
	
	@PostMapping("feedEmployeeData")
	public void setDataInDb(@Valid @RequestBody EmployeeDetails employeeDetails) throws SQLException{
		eds.saveEmployeeDetails();
	}
	
	
	
	

}
