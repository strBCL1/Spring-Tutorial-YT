package com.example.spring_tutorial_yt;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Song Of The Lake";
    }
}
