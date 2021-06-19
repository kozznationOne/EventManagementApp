package com.kozznation.eventManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kozznation.eventManagement.dao.MovieDto;
import com.kozznation.eventManagement.model.Movie;
import com.kozznation.eventManagement.model.MoviePage;
import com.kozznation.eventManagement.repository.MovieDaoRepository;
import com.kozznation.eventManagement.repository.MovieRepository;

@RestController
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	private MovieDaoRepository movieDaoRepository;
	
	

	public MovieController(MovieRepository movieRepository, MovieDaoRepository movieDaoRepository) {
		this.movieRepository = movieRepository;
		this.movieDaoRepository = movieDaoRepository;
	}



	@RequestMapping(value = "/movies/", method = RequestMethod.GET)
	public List<MovieDto> getMovies() {
		return (List<MovieDto>) this.movieRepository.findAll();
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public Page<MovieDto> getMovieTitleByName(@RequestParam(name = "name", required = false) String name, 
			@RequestParam(name = "directorName", required = false) String directorName,
			MoviePage moviePage) {
//		return this.movieRepository.findByTitle(name);
		return this.movieDaoRepository.findMovieSuggestionsByName(name, directorName,moviePage);
	}
//	@RequestMapping(value = "/movies", method = RequestMethod.GET)
//	public List<MovieDto> getMovieTitleByDirector(@RequestParam(name = "directorName", required = true) String directorName) {
//		return this.movieDaoRepository.findMovieSuggestionsByDirector(directorName);
//	}
	@GetMapping("/movies/{id}")
	@ResponseBody
	public Optional<MovieDto> getMovieTitleById(@PathVariable(name = "id", required = false) long id) {
		return this.movieRepository.findById(id);
	}
	

	
}
