package com.kozznation.eventManagement.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class TicketDto {

	@Id
	private long id;
	private long transactionId;
	@OneToOne
	@JoinColumn(name = "seatId", referencedColumnName = "id")
	private SeatDto seat;
	private long rowNumber;
	private long userId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public SeatDto getSeat() {
		return seat;
	}
	public void setSeat(SeatDto seat) {
		this.seat = seat;
	}
	public long getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(long rowNumber) {
		this.rowNumber = rowNumber;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
	
}
