package com.twschool.practice;

public class Coordinate {
    private int coordinateX;
    private int coordinateY;

    public Coordinate(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void increaseCoordinateY() {
        this.coordinateY = coordinateY + 1;
    }

    public void reduceCoordinateY() {
        this.coordinateY = coordinateY - 1;
    }

    public void increaseCoordinateX() {
        this.coordinateX = coordinateX + 1;
    }

    public void reduceCoordinateX() {
        this.coordinateX = coordinateX - 1;
    }
}
