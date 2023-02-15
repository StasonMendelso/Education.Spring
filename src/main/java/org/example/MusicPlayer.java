package org.example;

import java.util.List;

/**
 * @author Stanislav Hlova
 */
public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    // IoC

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        for(Music music : musicList) {
            System.out.printf("Playing: %s\n", music.getSong());
        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
