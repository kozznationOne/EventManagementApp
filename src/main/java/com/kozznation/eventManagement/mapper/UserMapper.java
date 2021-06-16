package com.kozznation.eventManagement.mapper;

import org.mapstruct.Mapper;

import com.kozznation.eventManagement.dao.UserDto;
import com.kozznation.eventManagement.model.User;

@Mapper
public interface UserMapper {
	UserDto userToDto(User userData);
}
