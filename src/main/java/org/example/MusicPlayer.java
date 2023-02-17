package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Stanislav Hlova
 */
@Component("myMusicPlayer")
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private PopMusic popMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.popMusic = popMusic;
    }

    public void playMusic() {
        System.out.printf("Playing: %s\n", classicalMusic.getSong());
        System.out.printf("Playing: %s\n", popMusic.getSong());
    }
}
