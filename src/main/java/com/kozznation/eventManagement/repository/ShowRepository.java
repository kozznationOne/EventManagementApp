package com.kozznation.eventManagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.model.Show;

public interface ShowRepository extends CrudRepository<Show, Long>{

	List<Show> findByScreenIdAndMovieId(long screenId, long movieId);
	
}
