package com.kozznation.eventManagement.dao;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "show")
public class ShowDto {
	@Id
	private long id;
	@OneToOne
	@JoinColumn(name = "screenId", referencedColumnName = "id")
	private ScreenDto screen;
	@OneToOne
	@JoinColumn(name = "movieId", referencedColumnName = "id")
	private MovieDto movie;
	private LocalTime startTime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ScreenDto getScreen() {
		return screen;
	}
	public void setScreen(ScreenDto screen) {
		this.screen = screen;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public MovieDto getMovie() {
		return movie;
	}
	public void setMovie(MovieDto movie) {
		this.movie = movie;
	}
	
	
}
