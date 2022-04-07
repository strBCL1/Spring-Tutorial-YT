package com.example.spring_tutorial_yt;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    static List<String> songsList = new LinkedList<>();

    static {
        songsList.add("War of Change");
        songsList.add("Happy Song");
        songsList.add("Le Deux");
    }

    @Override
    public String getSong() {
       return songsList.get(new Random().nextInt(songsList.size()));
    }
}
