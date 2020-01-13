package com.thoughtworks.marsrover;

public class MarsRover {
  private Position position;

  public MarsRover(int xPos, int yPos, Direction north) {
    this.position = Position.of(xPos, yPos,north);
  }

  public Position getPos() {
    return position;
  }
}
