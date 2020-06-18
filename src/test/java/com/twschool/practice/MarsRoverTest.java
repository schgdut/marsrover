package com.twschool.practice;

import org.junit.Test;

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
}
