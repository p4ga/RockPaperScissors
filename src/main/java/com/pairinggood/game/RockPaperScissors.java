package com.pairinggood.game;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {

    public static final String SCISSORS = "scissors";
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";

    public String play(String firstGesture, String secondGesture) {

        List<String> gestures = new ArrayList<>();
        gestures.add(firstGesture);
        gestures.add(secondGesture);

        if (gestures.contains(PAPER) && gestures.contains(SCISSORS)) {
            return SCISSORS;
        }
        if (PAPER.equals(firstGesture) && SCISSORS.equals(secondGesture)) {
            return SCISSORS;


        }
        if (gestures.contains(ROCK) && gestures.contains(SCISSORS)) {
            return ROCK;
        }
        if (ROCK.equals(firstGesture) && SCISSORS.equals(secondGesture)) {
            return ROCK;


        }
        if (gestures.contains(PAPER) && gestures.contains(ROCK)) {
            return PAPER;
        }
        if (PAPER.equals(firstGesture) && ROCK.equals(secondGesture)) {
            return PAPER;
        }

        return ROCK;

    }   
}
