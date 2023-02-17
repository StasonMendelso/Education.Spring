package org.example;

import org.springframework.stereotype.Component;

/**
 * @author Stanislav Hlova
 */
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
