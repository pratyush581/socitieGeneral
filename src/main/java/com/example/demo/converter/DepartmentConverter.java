package com.example.demo.converter;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.entity.Department;

/**
 * @author Pratyush.
 */
public class DepartmentConverter {
	public static Department dtoToEntity(DepartmentDto deptDto) {
		Department dept = new Department(deptDto.getDeptName());
		dept.setDeptId(deptDto.getDeptId());
		return dept;
	}

	public static DepartmentDto entityToDto(Department dept) {
		return new DepartmentDto(dept.getDeptId(), dept.getDeptName());
	}
}
