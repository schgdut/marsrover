package com.twschool.practice;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_1() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.say(1);

        //Then
        assertThat(result,is("1"));
    }

    @Test
    public void should_return_fizz_when_input_3() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.say(3);

        //Then
        assertThat(result,is("Fizz"));
    }

    @Test
    public void should_return_buzz_when_input_5(){
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.say(5);

        //Then
        assertThat(result,is("Buzz"));
    }

    @Test
    public void should_return_whizz_when_input_7(){
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.say(7);

        //Then
        assertThat(result,is("Whizz"));
    }
}
