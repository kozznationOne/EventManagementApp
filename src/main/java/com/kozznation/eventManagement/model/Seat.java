package com.kozznation.eventManagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seat {
	@Id
	private long id;
	private long showId;
	private long seatNumber;
	private long rowNumber;
	private boolean booked;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getShowId() {
		return showId;
	}
	public void setShowId(long showId) {
		this.showId = showId;
	}
	public long getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(long seatNumber) {
		this.seatNumber = seatNumber;
	}
	public long getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(long rowNumber) {
		this.rowNumber = rowNumber;
	}
	public boolean isBooked() {
		return booked;
	}
	public void setBooked(boolean booked) {
		this.booked = booked;
	}
	
	
}
