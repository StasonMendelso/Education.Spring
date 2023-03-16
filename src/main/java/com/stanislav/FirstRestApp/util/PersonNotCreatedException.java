package com.stanislav.FirstRestApp.util;

/**
 * @author Stanislav Hlova
 */
public class PersonNotCreatedException extends RuntimeException {
    public PersonNotCreatedException(String message) {
        super(message);
    }
}
