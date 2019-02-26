package com.pairinggood.game;

public class RockPaperScissors {

    public String play(String firstGesture, String secondGesture) {
        if ("paper".equals(firstGesture) && "scissors".equals(secondGesture)) {
            return "scissors";
        }
        return "rock";

    }   
}
