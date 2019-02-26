package com.pairinggood.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    @Test
    public void play_RockBeatsScissors() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play("rock", "scissors;");

        //assert
        assertEquals("rock", winner);
    }
}
