package com.kozznation.eventManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.model.Theatre;

public interface TheatreRepository extends CrudRepository<Theatre, Long>{

	Theatre findByName(String name);
	

}
