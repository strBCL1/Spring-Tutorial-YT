package com.example.spring_tutorial_yt;

public class MusicPlayer {
    private final Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
