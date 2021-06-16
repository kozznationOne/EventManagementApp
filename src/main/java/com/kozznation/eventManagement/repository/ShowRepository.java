package com.kozznation.eventManagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.dao.ShowDto;
import com.kozznation.eventManagement.model.Show;

public interface ShowRepository extends CrudRepository<ShowDto, Long>{

	List<ShowDto> findByScreenIdAndMovieId(long screenId, long movieId);
	
}
