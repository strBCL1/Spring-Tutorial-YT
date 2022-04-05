package com.example.spring_tutorial_yt;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic factoryClassicalMusic() {
        System.out.println("Factory method called");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Song Of The Lake";
    }
}
