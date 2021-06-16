package com.kozznation.eventManagement.mapper;

import org.mapstruct.Mapper;

import com.kozznation.eventManagement.dao.TheatreDto;
import com.kozznation.eventManagement.model.Theatre;

@Mapper
public interface TheatreMapper {
	TheatreDto theatreToDto(Theatre theatre);
}
