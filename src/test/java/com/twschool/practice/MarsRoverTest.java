package com.twschool.practice;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_init_rover_coordinate_and_direction_given_x0_y0_N() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "N";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("N"));
    }

    @Test
    public void should_return_x0_y1_N_given_x0_y0_N_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "N";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("M"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(1));
        assertThat(marsRover.getDirection(), is("N"));
    }

    @Test
    public void should_return_x0_y0_W_given_x0_y0_N_and_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "N";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("L"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("W"));
    }

    @Test
    public void should_return_x0_y0_E_given_x0_y0_N_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "N";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("R"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("E"));
    }

    @Test
    public void should_init_rover_coordinate_and_direction_given_x0_y0_S() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "S";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("S"));
    }

    @Test
    public void should_return_x0_y1_S_given_x0_y0_S_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "S";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("M"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(1));
        assertThat(marsRover.getDirection(), is("N"));
    }

}
