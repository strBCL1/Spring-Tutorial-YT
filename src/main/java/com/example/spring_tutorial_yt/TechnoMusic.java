package com.example.spring_tutorial_yt;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization!");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction!");
    }

    @Override
    public String getSong() {
        return songsList.get(new Random().nextInt(songsList.size()));
    }
}
