package com.kozznation.eventManagement.mapper;

import com.kozznation.eventManagement.dao.ShowDto;
import com.kozznation.eventManagement.model.Show;

public interface ShowMapper {
	
	ShowDto showToDto(Show show);

}
