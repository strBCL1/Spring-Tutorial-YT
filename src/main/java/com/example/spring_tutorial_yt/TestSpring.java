package com.example.spring_tutorial_yt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//
//        // Print name and volume
//        System.out.println("Name: " + musicPlayer.getName() + "\nVolume: " + musicPlayer.getVolume());
//
//        Music firstMusicBean = context.getBean("firstMusicBean", RockMusic.class);
//        Music secondMusicBean = context.getBean("secondMusicBean", ClassicalMusic.class);
//        Music thirdMusicBean = context.getBean("thirdMusicBean", AmbientMusic.class);
//
//        musicPlayer.getMusicList().add(firstMusicBean);
//        musicPlayer.getMusicList().add(secondMusicBean);
//        musicPlayer.getMusicList().add(thirdMusicBean);
//
//        musicPlayer.playMusic();

        context.close();
    }
}
