package com.kozznation.eventManagement.repository;


import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.dao.MovieDto;
import com.kozznation.eventManagement.model.Movie;

public interface MovieRepository extends CrudRepository<MovieDto, Long> {

	MovieDto findByTitle(String name);

}
