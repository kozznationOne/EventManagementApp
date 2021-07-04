package com.kozznation.eventManagement.controller;

import com.kozznation.eventManagement.dao.LoginSessionDto;
import com.kozznation.eventManagement.repository.LoginSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class LoginController {

    @Autowired
    private LoginSessionRepository loginSessionRepository;

    public LoginController(LoginSessionRepository loginSessionRepository) {
        this.loginSessionRepository = loginSessionRepository;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userLogin(@RequestParam(name = "id", required = false) Long id,
            @RequestParam(name = "sessionId", required = false) String sessionId,
            @RequestParam(name = "password", required = false) String password) {

        if(loginSessionRepository.existsById(id)){
            LoginSessionDto session = loginSessionRepository.findById(id).orElse(null);
            String sid = session.getSessionID();

            if(sessionId != null && sid.equals(sessionId)){
                long now = System.currentTimeMillis();
                long elapsedTime = now - session.getSessionStartTime();
                if(elapsedTime > 30000){
                    loginSessionRepository.deleteById(id);
                    return "Session Expired!";
                }
                return "You are logged in!";
            }
            else{
                if(sessionId == null)
                    return "No SessionID provided";
                else
                    return "Wrong session ID!";
            }
        }
        Random random = new Random();

        String newSessionId = random.ints(48, 122 + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(20)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        long now = System.currentTimeMillis();
        LoginSessionDto loginSessionDto = new LoginSessionDto(id, newSessionId, now);
        loginSessionRepository.save(loginSessionDto);
        return "New Session created...\nsessionid : " + newSessionId;
    }
}
