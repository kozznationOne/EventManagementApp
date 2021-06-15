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

import com.kozznation.eventManagement.model.Movie;
import com.kozznation.eventManagement.repository.MovieRepository;

@RestController
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	

	public MovieController(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}



	@RequestMapping(value = "/movies/", method = RequestMethod.GET)
	public List<Movie> getMovies() {
		return (List<Movie>) this.movieRepository.findAll();
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public Movie getMovieTitleByName(@RequestParam(name = "name", required = true) String name) {
		return this.movieRepository.findByTitle(name);
	}
	@GetMapping("/movies/{id}")
	@ResponseBody
	public Optional<Movie> getMovieTitleById(@PathVariable(name = "id", required = false) long id) {
		return this.movieRepository.findById(id);
	}
	

	
}
