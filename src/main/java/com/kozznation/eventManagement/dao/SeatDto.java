package com.kozznation.eventManagement.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "seat")
public class SeatDto {
	@Id
	private long id;
	@OneToOne
	@JoinColumn(name = "showId", referencedColumnName = "id")
	private ShowDto show;
	private long seatNumber;
	private long rowNumber;
	private boolean booked;
	
	
	public ShowDto getShow() {
		return show;
	}
	public void setShow(ShowDto show) {
		this.show = show;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
//	public ShowDto getShowId() {
//		return showId;
//	}
//	public void setShowId(long showId) {
//		this.showId = showId;
//	}
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
