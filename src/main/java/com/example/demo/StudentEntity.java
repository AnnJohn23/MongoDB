package com.example.demo;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document 
public class StudentEntity {
	
	
	
	 private int StudId;
	 private String StudName;
	 private String StudDept;

	
	


	public StudentEntity() {
		super();
	}


	public int getStudId() {
		return StudId;
	}


	public void setStudId(int studId) {
		StudId = studId;
	}


	public String getStudName() {
		return StudName;
	}


	public void setStudName(String studName) {
		StudName = studName;
	}


	public String getStudDept() {
		return StudDept;
	}


	public void setStudDept(String studDept) {
		StudDept = studDept;
	}

	
	
	
}