package com.kozznation.eventManagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.dao.SeatDto;
import com.kozznation.eventManagement.model.Seat;

public interface SeatRepository extends CrudRepository<SeatDto, Long>{

	List<SeatDto> findByShowId(long showId);
	
}
