package com.twschool.practice;

import java.util.List;

public class MarsRover {
    private  Coordinate coordinate;
    private  String direction;

    public MarsRover(Coordinate coordinate, String direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getDirection() {
        return direction;
    }

    public void execute(List<String> commands) {
        commands.forEach(command -> {
            if (command.equals("M")) {
                coordinate.increaseCoordinateY();
            }else if (command.equals("L")){
                if (direction.equals("N")) {
                    this.direction = "W";
                }else if (direction.equals("S")) {
                    this.direction = "E";
                }
            }
            else if (command.equals("R")){
                if (direction.equals("N")) {
                    this.direction = "E";
                }else if (direction.equals("S")) {
                    this.direction = "W";
                }
            }
        });
    }
}
