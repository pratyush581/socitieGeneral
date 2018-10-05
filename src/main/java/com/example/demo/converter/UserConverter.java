package com.example.demo.converter;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

/**
 * @author Pratyush.
 */
public class UserConverter {
	public static User dtoToEntity(UserDto userDto) {
		User user = new User( userDto.firstName,  userDto.lastName,  userDto.gender,  userDto.dob);
		user.setUserId(userDto.getUserId());
		user.setDept(DepartmentConverter.dtoToEntity(userDto.deptDto));
		return user;
	}

	public static UserDto entityToDto(User user) {
		UserDto userDto = new UserDto(user.getUserId(), user.getFirstName(), user.getLastName(), user.getGender(), user.getDateOfBirth(), DepartmentConverter.entityToDto(user.getDept()));
		return userDto;
	}
}
