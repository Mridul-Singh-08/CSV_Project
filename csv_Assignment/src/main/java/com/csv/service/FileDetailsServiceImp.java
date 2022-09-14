package com.csv.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FileDetailsServiceImp {
	
//	@Autowired
//	private FileDetailsRepo fileDetailsRepo;
//	
//	String line = "";
//	int insertCount = 0;
//	
//	public void saveFileData() {
//		try {
//			insertCount++;
//
//			File file = new File("src/main/resources/SampleEmployee(3).csv");
//			Files obj = new Files();
//			int noOfRecords = 0;
//
//			Date date = new Date();
//			BufferedReader buff = new BufferedReader(new FileReader(file));
//			while ((line = buff.readLine()) != null) {
//
//				noOfRecords++;
//				String[] data = line.split(",");
//
//				obj.setFilename(file.getName()); 
//				obj.setCreateddate(new SimpleDateFormat("E yyyy.MM.dd").format(date));
//				obj.setUpdateddate(new SimpleDateFormat("E yyyy.MM.dd HH:MM:SS").format(file.lastModified()));
//
//			}
//
//			obj.setNoOfRecords(Integer.toString(noOfRecords));
//			obj.setInsertCount(Integer.toString(insertCount));
//			repo.save(obj);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//		
//	}
	
	
	

}
