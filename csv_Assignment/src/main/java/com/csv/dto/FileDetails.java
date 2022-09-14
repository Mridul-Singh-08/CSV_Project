package com.csv.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FileDetails {
	
	@Id
	@GeneratedValue
	private int id;
	private String fileName;
	private String noOfRecords;
	private String insertCount;
	private String createdDate;
	private String updatedDate;
	
		
	
	public FileDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getNoOfRecords() {
		return noOfRecords;
	}
	public void setNoOfRecords(String noOfRecords) {
		this.noOfRecords = noOfRecords;
	}
	public String getInsertCount() {
		return insertCount;
	}
	public void setInsertCount(String insertCount) {
		this.insertCount = insertCount;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}



	@Override
	public String toString() {
		return "FileDetails [id=" + id + ", fileName=" + fileName + ", noOfRecords=" + noOfRecords + ", insertCount="
				+ insertCount + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	
	
	

}
