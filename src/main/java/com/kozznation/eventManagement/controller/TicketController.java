package com.kozznation.eventManagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kozznation.eventManagement.model.Movie;
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
	public List<Ticket> getTickets(){
		return (List<Ticket>) ticketRepository.findAll();
	}
	
	@GetMapping("/tickets/{id}")
	@ResponseBody
	public Optional<Ticket> getTicketById(@PathVariable(name = "id", required = false) long id) {
		return this.ticketRepository.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/tickets/")
	public List<Optional<Ticket>> addTickets(@RequestBody List<Ticket> tickets) {
		ticketRepository.saveAll(tickets);
		List<Optional<Ticket>> ticketList = new ArrayList<>();
		for(Ticket ticket: tickets) {
			Optional<Ticket> t = ticketRepository.findById(ticket.getId()); 
			ticketList.add(t);
		}
		return ticketList;
	}
	

}
