package com.stanislav.spring.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

/**
 * @author Stanislav Hlova
 */
public class PersonDTO {
    @NotEmpty(message = "Username can't be empty")
    @Size(min = 2, max = 100, message = "The username must be in size 2-100.")
    private String username;
    @Min(value = 1900,message = "The year of birth must be greater than 1900")
    private int yearOfBirth;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
