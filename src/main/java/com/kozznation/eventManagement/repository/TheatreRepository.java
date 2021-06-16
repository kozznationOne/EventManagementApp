package com.kozznation.eventManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.dao.TheatreDto;
import com.kozznation.eventManagement.model.Theatre;

public interface TheatreRepository extends CrudRepository<TheatreDto, Long>{

	TheatreDto findByName(String name);
	

}
