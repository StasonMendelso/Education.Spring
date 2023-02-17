package org.example;

import org.springframework.stereotype.Component;

/**
 * @author Stanislav Hlova
 */
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Blame";
    }
}
