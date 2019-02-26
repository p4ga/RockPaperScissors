package com.pairinggood.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    @Test
    public void play_RockThenScissor_RockBeatsScissors() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play("rock", "scissors");

        //assert
        assertEquals("rock", winner);
    }
    @Test
    public void play_ScissorThenRock_RockBeatsScissors() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play("scissors", "rock");

        //assert
        assertEquals("rock", winner);

    }

    @Test
    public void play_PaperThenScissor_ScissorsBeatsPaper() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play("paper", "scissors");

        //assert
        assertEquals("scissors", winner);
    }

}
