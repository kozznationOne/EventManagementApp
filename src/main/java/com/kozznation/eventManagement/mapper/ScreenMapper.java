package com.kozznation.eventManagement.mapper;

import org.mapstruct.Mapper;

import com.kozznation.eventManagement.dao.ScreenDto;
import com.kozznation.eventManagement.model.Screen;

@Mapper
public interface ScreenMapper {
	ScreenDto ScreToDto(Screen screen);
	
}
