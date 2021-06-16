package com.kozznation.eventManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.kozznation.eventManagement.dao.TicketDto;
import com.kozznation.eventManagement.model.Ticket;

public interface TicketRepository extends CrudRepository<TicketDto, Long>{
	
}
