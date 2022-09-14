package com.csv.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csv.dao.EmployeeDetailsRepository;
import com.csv.dto.EmployeeDetails;

@Service
public class EmployeeDetailsServiseImp {
	
	@Autowired
	private EmployeeDetailsRepository EmployeeDetailsRepository;
	
	String flag = "";
	public void saveEmployeeDetails() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/DetalisemployeeDemo.csv"));
					
			while((flag=br.readLine())!=null) {
				String [] data = flag.split(",");
				
				EmployeeDetails e = new EmployeeDetails();
				e.setFirstName(data[0]);
				e.setMiddleName(data[1]);
				e.setLastName(data[2]);
				e.setAge(data[3]);
				e.setSalary(data[4]);
				e.setEmailId(data[5]);
				System.out.println(e);
				this.EmployeeDetailsRepository.save(e);
			}
			
		} catch (IOException i) {
			// TODO Auto-generated catch block
			i.printStackTrace();
		}
	
	}
}
