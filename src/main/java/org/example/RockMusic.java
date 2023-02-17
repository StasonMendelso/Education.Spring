package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislav Hlova
 */
@Component
public class RockMusic implements Music{
    private final List<String> songs = new ArrayList<>();
    {
        songs.add("Purple Haze - Jimi Hendrix.");
        songs.add("Whole Lotta Love - Led Zeppelin.");
        songs.add("Sympathy for the Devil - The Rolling Stones");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
