package com.kozznation.eventManagement.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "screen")
public class ScreenDto {
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
