package com.company;

public class Artist implements Performer {
    @Override
    public void play() {
        System.out.println("Do play");
    }

    public void makeFunnyThings(){
        System.out.println("I make funny things");
    }
    public void makeBadThings(){
        System.out.println("I make bad things");
    }
    public void makeEvilThings(){
        System.out.println("I make evil things");
    }

}
