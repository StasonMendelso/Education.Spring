package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Stanislav Hlova
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music popMusic = context.getBean("popMusic", Music.class);

        MusicPlayer popMusicPlayer = new MusicPlayer(popMusic);
        popMusicPlayer.playMusic();

        Music rockMusic = context.getBean("rockMusic", Music.class);
        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        rockMusicPlayer.playMusic();

        context.close();
    }
}
