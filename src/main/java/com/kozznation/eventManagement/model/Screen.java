package com.kozznation.eventManagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Screen {
	@Id
	private long id;
	private long theatreId;
	private long numberOfSeats;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(long theatreId) {
		this.theatreId = theatreId;
	}
	public long getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(long numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	
}
