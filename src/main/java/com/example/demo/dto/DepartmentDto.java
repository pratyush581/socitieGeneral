package com.example.demo.dto;

/**
 * @author Pratyush.
 */
public class DepartmentDto {
    Integer deptId;
    String deptName;
	
    
    public DepartmentDto(Integer deptId, String deptName) {
    	this.deptId=deptId;
    	this.deptName=deptName;
	}
    
	public DepartmentDto() {
		
	}

	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

    
    
}
