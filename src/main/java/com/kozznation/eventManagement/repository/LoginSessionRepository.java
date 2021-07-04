package com.kozznation.eventManagement.repository;

import com.kozznation.eventManagement.dao.LoginSessionDto;
import org.springframework.data.repository.CrudRepository;

public interface LoginSessionRepository extends CrudRepository<LoginSessionDto, Long> {

}
