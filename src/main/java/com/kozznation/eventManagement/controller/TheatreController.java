package com.kozznation.eventManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kozznation.eventManagement.dao.TheatreDto;
import com.kozznation.eventManagement.model.Theatre;
import com.kozznation.eventManagement.repository.TheatreRepository;

@RestController
public class TheatreController {
	
	@Autowired
	private TheatreRepository theatreRepository;
	
	
	
	public TheatreController(TheatreRepository theatreRepository) {
		super();
		this.theatreRepository = theatreRepository;
	}

	@RequestMapping(value = "/theatres/", method = RequestMethod.GET)
	public List<TheatreDto> getTheatre() {
		return (List<TheatreDto>) this.theatreRepository.findAll();
	}
	
	@RequestMapping(value = "/theatres", method = RequestMethod.GET)
	public TheatreDto getTheatreByName(@RequestParam(name = "name", required = true) String name) {
		return this.theatreRepository.findByName(name);
	}
	@GetMapping("/theatres/{id}")
	@ResponseBody
	public Optional<TheatreDto> getTheatreById(@PathVariable(name = "id", required = false) long id) {
		return this.theatreRepository.findById(id);
	}

}
