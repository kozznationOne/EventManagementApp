package com.kozznation.eventManagement.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kozznation.eventManagement.dao.ShowDto;
import com.kozznation.eventManagement.model.Show;
import com.kozznation.eventManagement.repository.ShowRepository;

@RestController
public class ShowController {
	
	private ShowRepository showRepository;

	public ShowController(ShowRepository showRepository) {
		this.showRepository = showRepository;
	}
	
	@RequestMapping(value = "/shows", method = RequestMethod.GET)
	public List<ShowDto> getShowByScreenIdAndMovieId(@RequestParam(name = "screenId", required = false) long screenId,
			@RequestParam(name = "movieId", required = false) long movieId) {
		return (List<ShowDto>) this.showRepository.findByScreenIdAndMovieId(screenId, movieId);
	}
	
}
