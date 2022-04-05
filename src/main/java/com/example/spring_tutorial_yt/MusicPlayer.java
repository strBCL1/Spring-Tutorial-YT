package com.example.spring_tutorial_yt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusicBean") Music music1,
                       @Qualifier("technoMusicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
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
