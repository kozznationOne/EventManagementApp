package com.kozznation.eventManagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.model.Seat;

public interface SeatRepository extends CrudRepository<Seat, Long>{

	List<Seat> findByShowId(long showId);
	
}
