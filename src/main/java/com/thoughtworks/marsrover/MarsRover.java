package com.thoughtworks.marsrover;

import java.util.List;

public class MarsRover {
  private Position position;

  public MarsRover(int xPos, int yPos, Direction north) {
    this.position = Position.of(xPos, yPos, north);
  }

  public Position getPos() {
    return position;
  }

  public void moveForward() {
    this.position = Position.of(position.getX() + 1, position.getY(), position.getDirection());
  }

  public void turnLeft() {
    this.position =
        Position.of(position.getX(), position.getY(), Direction.getNext(position.getDirection()));
  }

  public void turnRight() {
    this.position =
        Position.of(
            position.getX(), position.getY(), Direction.getPrevious(position.getDirection()));
  }

  public void receiveCommanders(List<Commander> commanderList) {
    commanderList.forEach(
        commander -> {
          if (commander == Commander.MOVE_FORWARD) {
            this.moveForward();
          }
          if (commander == Commander.TURN_LEFT) {
            this.turnLeft();
          }
        });
  }
}
