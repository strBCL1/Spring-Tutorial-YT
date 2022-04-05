package com.example.spring_tutorial_yt;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Let's get the party started!";
    }
}
