package com.stanislav.spring.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

/**
 * @author Stanislav Hlova
 */
public class AuthenticationDTO {
    @NotEmpty(message = "Username can't be empty")
    @Size(min = 2, max = 100, message = "The username must be in size 2-100.")
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
