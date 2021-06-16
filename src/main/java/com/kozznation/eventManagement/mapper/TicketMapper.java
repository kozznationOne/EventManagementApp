package com.kozznation.eventManagement.mapper;

import org.mapstruct.Mapper;

import com.kozznation.eventManagement.dao.TicketDto;
import com.kozznation.eventManagement.model.Ticket;

@Mapper
public interface TicketMapper {
	TicketDto ticketToDto(Ticket ticket);
}
