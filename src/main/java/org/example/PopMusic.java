package org.example;

import org.springframework.stereotype.Component;

/**
 * @author Stanislav Hlova
 */
@Component
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Blame";
    }
}
