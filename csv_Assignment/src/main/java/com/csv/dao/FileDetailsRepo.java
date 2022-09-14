package com.csv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csv.dto.FileDetails;

public interface FileDetailsRepo extends JpaRepository<FileDetails, Integer>{

}
