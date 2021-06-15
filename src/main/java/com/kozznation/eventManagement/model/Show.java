package com.kozznation.eventManagement.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Show {
	@Id
	private long id;
	private long screenId;
	private long movieId;
	private LocalTime startTime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getScreenId() {
		return screenId;
	}
	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	
	
}
