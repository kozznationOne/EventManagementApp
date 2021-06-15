package com.kozznation.eventManagement.repository;


import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {

	Movie findByTitle(String name);

}
