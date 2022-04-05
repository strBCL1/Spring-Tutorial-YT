package com.example.spring_tutorial_yt;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Component("technoMusicBean")
public class TechnoMusic implements Music {
    static List<String> songsList = new LinkedList<>();

    static {
        songsList.add("The Game");
        songsList.add("Humanoid");
        songsList.add("Cyberspace");
    }

    @Override
    public String getSong() {
        return songsList.get(new Random().nextInt(songsList.size()));
    }
}
