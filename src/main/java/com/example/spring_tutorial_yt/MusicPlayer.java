package com.example.spring_tutorial_yt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private String volume;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusicBean") Music music1,
                       @Qualifier("technoMusicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void playMusic(MusicGenres musicGenre) {
        System.out.print("Playing: ");

        if (musicGenre == MusicGenres.ROCK) {
            System.out.println(music1.getSong());
        }
        else {
            System.out.println(music2.getSong());
        }
    }
}
