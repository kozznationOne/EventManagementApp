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
	public List<Theatre> getTheatre() {
		return (List<Theatre>) this.theatreRepository.findAll();
	}
	
	@RequestMapping(value = "/theatres", method = RequestMethod.GET)
	public Theatre getTheatreByName(@RequestParam(name = "name", required = true) String name) {
		return this.theatreRepository.findByName(name);
	}
	@GetMapping("/theatres/{id}")
	@ResponseBody
	public Optional<Theatre> getTheatreById(@PathVariable(name = "id", required = false) long id) {
		return this.theatreRepository.findById(id);
	}

}
