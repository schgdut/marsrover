package com.twschool.practice;

public class MarsRover {
    private final Coordinate coordinate;
    private final String direction;

    public MarsRover(Coordinate coordinate, String direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getDirection() {
        return "N";
    }
}
