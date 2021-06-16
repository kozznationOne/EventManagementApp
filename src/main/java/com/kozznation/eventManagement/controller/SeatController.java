package com.kozznation.eventManagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kozznation.eventManagement.dao.SeatDto;
import com.kozznation.eventManagement.model.Seat;
import com.kozznation.eventManagement.model.Show;
import com.kozznation.eventManagement.repository.SeatRepository;

@RestController
public class SeatController {

	private final SeatRepository seatRepository;

	public SeatController(SeatRepository seatRepository) {
		this.seatRepository = seatRepository;
	}
	
	@RequestMapping(value = "/seats", method = RequestMethod.GET)
	public List<SeatDto> getSeatsByShowId(@RequestParam(name = "showId", required = false) long showId) {
		return (List<SeatDto>) this.seatRepository.findByShowId(showId);
	}
	
	
	
	
}
