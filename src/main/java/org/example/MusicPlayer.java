package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Stanislav Hlova
 */
@Component("myMusicPlayer")
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int index = random.nextInt(3);
        if (musicGenre == MusicGenre.ROCK) {
            System.out.printf("Playing rock music: %s\n", rockMusic.getSongs().get(index));
        }else{
            System.out.printf("Playing classical music: %s\n", classicalMusic.getSongs().get(index));
        }
    }
}
