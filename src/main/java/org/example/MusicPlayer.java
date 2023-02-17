package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Stanislav Hlova
 */
@Component("myMusicPlayer")
public class MusicPlayer {
    private Music music;
    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.printf("Playing: %s", music.getSong());
    }
}
