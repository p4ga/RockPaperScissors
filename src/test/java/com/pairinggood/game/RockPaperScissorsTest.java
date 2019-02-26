package com.pairinggood.game;

import org.junit.Test;

import static com.pairinggood.game.RockPaperScissors.*;
import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    private final RockPaperScissors game = new RockPaperScissors();

    @Test
    public void play_RockThenScissor_RockBeatsScissors() {
        assertEquals(ROCK, game.play(ROCK, SCISSORS));
    }

    @Test
    public void play_ScissorThenRock_RockBeatsScissors() {
        assertEquals(ROCK, game.play(SCISSORS, ROCK));
    }

    @Test
    public void play_PaperThenScissor_ScissorsBeatsPaper() {
        assertEquals(SCISSORS, game.play(PAPER, SCISSORS));
    }

    @Test
    public void play_ScissorThenPaper_ScissorsBeatsPaper() {
        assertEquals(SCISSORS, game.play(SCISSORS, PAPER));
    }

    @Test
    public void play_RockThenPaper_RockBeatsPaper() {
        assertEquals(PAPER, game.play(ROCK, PAPER));
    }

    @Test
    public void play_PaperThenRock_PaperBeatsRock() {
        assertEquals(PAPER, game.play(PAPER, ROCK));
    }

    @Test
    public void play_RockThenRock_Draw() {
        assertEquals("draw", game.play(ROCK, ROCK));
    }

    @Test
    public void play_PaperThenPaper_Draw() {
        assertEquals("draw", game.play(PAPER, PAPER));
    }

    @Test
    public void play_ScissorsThenScissors_Draw() {
        assertEquals("draw", game.play(SCISSORS, SCISSORS));

    }

}
