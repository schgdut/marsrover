package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class AnswerTest {
    @Test
    public void should_return_4A0B_when_compare_with_1234_given_answer_1234() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("1 2 3 4");

        Assert.assertEquals("4A0B",result);
    }

    @Test
    public void should_return_0A4B_when_compare_with_1234_given_answer_4321() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("4 3 2 1");

        Assert.assertEquals("0A4B",result);
    }

    @Test
    public void should_return_3A0B_when_compare_with_1234_given_answer_1235() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("1 2 3 5");

        Assert.assertEquals("3A0B",result);
    }

    @Test
    public void should_return_1A3B_when_compare_with_1234_given_answer_1423() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("1 4 2 3");

        Assert.assertEquals("1A3B",result);
    }

    @Test
    public void should_return_2A2B_when_compare_with_1234_given_answer_1243() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("1 2 4 3");

        Assert.assertEquals("2A2B",result);
    }

    @Test
    public void should_return_2A1B_when_compare_with_1234_given_answer_1253() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("1 2 5 3");

        Assert.assertEquals("2A1B",result);
    }

    @Test
    public void should_return_2A0B_when_compare_with_1234_given_answer_1256() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("1 2 5 6");

        Assert.assertEquals("2A0B",result);
    }

    @Test
    public void should_return_1A2B_when_compare_with_1234_given_answer_1543() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("1 5 4 3");

        Assert.assertEquals("1A2B",result);
    }

    @Test
    public void should_return_1A1B_when_compare_with_1234_given_answer_1563() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("1 5 6 3");

        Assert.assertEquals("1A1B",result);
    }

    @Test
    public void should_return_1A0B_when_compare_with_1234_given_answer_1567() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("1 5 6 7");

        Assert.assertEquals("1A0B",result);
    }

    @Test
    public void should_return_0A3B_when_compare_with_1234_given_answer_4325() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("4 3 2 5");

        Assert.assertEquals("0A3B",result);
    }

    @Test
    public void should_return_0A2B_when_compare_with_1234_given_answer_4365() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("4 3 6 5");

        Assert.assertEquals("0A2B",result);
    }

    @Test
    public void should_return_0A1B_when_compare_with_1234_given_answer_4765() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("4 7 6 5");

        Assert.assertEquals("0A1B",result);
    }

    @Test
    public void should_return_0A0B_when_compare_with_1234_given_answer_8765() {
        GameAnswer answer = new GameAnswer("1 2 3 4");

        String result = answer.check("8 7 6 5");

        Assert.assertEquals("0A0B",result);
    }

}
