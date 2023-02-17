package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislav Hlova
 */
@Component
public class ClassicalMusic implements Music{
    private final List<String> songs = new ArrayList<>();
    {
        songs.add("Mozart – Eine kleine Nachtmusik");
        songs.add("Beethoven – Symphony No.5 in C minor");
        songs.add("Vivaldi – The Four Seasons");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
