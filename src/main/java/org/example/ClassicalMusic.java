package org.example;

import org.springframework.stereotype.Component;

/**
 * @author Stanislav Hlova
 */
@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
