package com.twschool.practice;

public class Coordinate {
    private int coordinateX;
    private int coordinateY;

    public Coordinate(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return 0;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void increaseCoordinateY() {
        this.coordinateY = coordinateY + 1;
    }

}
