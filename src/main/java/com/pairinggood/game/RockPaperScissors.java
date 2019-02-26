package com.pairinggood.game;

public class RockPaperScissors {

    public static final String SCISSORS = "scissors";

    public String play(String firstGesture, String secondGesture) {
        if ("paper".equals(firstGesture) && SCISSORS.equals(secondGesture)) {
            return SCISSORS;
        }
        return "rock";

    }   
}
