package com.company;

public class Artist implements Performer {
    @Override
    public void play() {
        System.out.println("Do play");
    }

    public void makeFunnyThings(){
        System.out.println("I make funny things");
    }
}
