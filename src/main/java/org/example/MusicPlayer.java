package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

/**
 * @author Stanislav Hlova
 */
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Random random = new Random();
        int index = random.nextInt(musicList.size());
        System.out.printf("Playing: %s\n", musicList.get(index).getSong());
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
