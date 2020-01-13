package com.thoughtworks.marsrover;

public class MarsRover {
  private Position position;

  public MarsRover(int xPos, int yPos, Direction north) {
    this.position = Position.of(xPos, yPos,north);
  }

  public Position getPos() {
    return position;
  }

  public void moveForward() {
    this.position = Position.of(position.getX() + 1, position.getY(), position.getDirection());
  }
}
