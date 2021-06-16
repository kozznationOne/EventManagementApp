package com.kozznation.eventManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.dao.ScreenDto;
import com.kozznation.eventManagement.model.Screen;

public interface ScreenRepository extends CrudRepository<ScreenDto, Long>{
	
}
