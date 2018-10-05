package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.Gender;

/**
 * @author Pratyush.
 */
public class UserDto {
    
	public Integer userId;
	public String firstName;
	public String lastName;
	public Gender gender;
	public Date dob;
	public DepartmentDto deptDto;
	
	
	
	
	public UserDto(Integer userId, String firstName, String lastName, Gender gender, Date dob, DepartmentDto deptDto) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.deptDto = deptDto;
	}
	
	public UserDto() {
		super();
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public DepartmentDto getDeptDto() {
		return deptDto;
	}
	public void setDeptDto(DepartmentDto deptDto) {
		this.deptDto = deptDto;
	}
	
	
	
	
}
