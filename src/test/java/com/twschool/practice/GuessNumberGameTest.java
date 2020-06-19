package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberGameTest {
    @Test
    public void should_return_4A0B_when_input_1234_given_game_with_answer_1234() {
        GameAnswer gameAnswer = new GameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame = new GuessNumberGame(gameAnswer);

        String result = guessNumberGame.guess("1 2 3 4");

        Assert.assertEquals("4A0B",result);
    }



}

