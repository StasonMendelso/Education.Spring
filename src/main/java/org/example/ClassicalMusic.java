package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Stanislav Hlova
 */
public class ClassicalMusic implements Music {

    @PostConstruct
    public void init() {
        System.out.println("Initializing...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying...");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
