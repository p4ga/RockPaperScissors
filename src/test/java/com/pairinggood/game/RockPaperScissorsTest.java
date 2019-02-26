package com.pairinggood.game;

import org.junit.Test;

import static com.pairinggood.game.RockPaperScissors.SCISSORS;
import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    @Test
    public void play_RockThenScissor_RockBeatsScissors() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play("rock", SCISSORS);

        //assert
        assertEquals("rock", winner);
    }

    @Test
    public void play_ScissorThenRock_RockBeatsScissors() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play(SCISSORS, "rock");

        //assert
        assertEquals("rock", winner);

    }

    @Test
    public void play_PaperThenScissor_ScissorsBeatsPaper() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play("paper", SCISSORS);

        //assert
        assertEquals(SCISSORS, winner);
    }

}
