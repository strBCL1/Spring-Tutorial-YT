package com.example.spring_tutorial_yt;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(Music music, String name, int volume) {
        this.music = music;
        this.name = name;
        this.volume = volume;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
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

    public void playMusic() {
        System.out.println("Current song: " + music.getSong());
    }
}
