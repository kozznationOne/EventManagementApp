package com.kozznation.eventManagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kozznation.eventManagement.dao.TicketDto;
import com.kozznation.eventManagement.model.Ticket;
import com.kozznation.eventManagement.repository.TicketRepository;

@RestController
public class TicketController {

	private final TicketRepository ticketRepository;

	public TicketController(TicketRepository ticketRepository) {
		super();
		this.ticketRepository = ticketRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/tickets")
	public List<TicketDto> getTickets(){
		return (List<TicketDto>) ticketRepository.findAll();
	}
	
	@GetMapping("/tickets/{id}")
	@ResponseBody
	public Optional<TicketDto> getTicketById(@PathVariable(name = "id", required = false) long id) {
		return this.ticketRepository.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/tickets/")
	public List<Optional<TicketDto>> addTickets(@RequestBody List<TicketDto> tickets) {
		ticketRepository.saveAll(tickets);
		List<Optional<TicketDto>> ticketList = new ArrayList<>();
		for(TicketDto ticket: tickets) {
			Optional<TicketDto> t = ticketRepository.findById(ticket.getId()); 
			ticketList.add(t);
		}
		return ticketList;
	}
	

}
