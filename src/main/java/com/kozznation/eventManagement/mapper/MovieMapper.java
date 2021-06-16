package com.kozznation.eventManagement.mapper;

import org.mapstruct.Mapper;

import com.kozznation.eventManagement.dao.MovieDto;
import com.kozznation.eventManagement.model.Movie;

@Mapper
public interface MovieMapper {
	MovieDto movieToDto(Movie movie);
}
