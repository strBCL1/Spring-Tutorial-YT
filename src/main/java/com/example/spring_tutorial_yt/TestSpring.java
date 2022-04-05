package com.example.spring_tutorial_yt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusicBean", RockMusic.class);
        Music music1 = context.getBean("classicalMusicBean", ClassicalMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);

        musicPlayer.playMusic();
        musicPlayer1.playMusic();

        context.close();
    }
}
