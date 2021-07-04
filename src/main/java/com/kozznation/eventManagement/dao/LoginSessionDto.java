package com.kozznation.eventManagement.dao;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login_session")
public class LoginSessionDto {

    @Id
    private long id;
    private String username;
    private String sessionID;
    private long sessionStartTime;

    public LoginSessionDto() {
    }

    public LoginSessionDto(long id, String sessionID, long sessionStartTime) {
        this.id = id;
        this.sessionID = sessionID;
        this.sessionStartTime = sessionStartTime;
    }

    public long getSessionStartTime() {
        return sessionStartTime;
    }

    public void setSessionStartTime(long sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
}
