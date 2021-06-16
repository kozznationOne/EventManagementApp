package com.kozznation.eventManagement.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "screen")
public class ScreenDto {
	@Id
	private long id;
	@OneToOne
	@JoinColumn(name = "theatreId", referencedColumnName = "id")
	private TheatreDto theatre;
	private long numberOfSeats;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TheatreDto getTheatre() {
		return theatre;
	}
	public void setTheatre(TheatreDto theatre) {
		this.theatre = theatre;
	}
	public long getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(long numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	
}
