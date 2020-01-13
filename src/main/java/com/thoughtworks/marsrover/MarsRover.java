package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.Direction.NORTH;
import static com.thoughtworks.marsrover.Direction.SOUTH;
import static com.thoughtworks.marsrover.Direction.WEST;
import static com.thoughtworks.marsrover.Direction.getNext;
import static com.thoughtworks.marsrover.Direction.getPrevious;

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
    if (position.getDirection() == NORTH) {
      this.position = Position.of(position.getX() + 1, position.getY(), position.getDirection());
    }
    if (position.getDirection() == WEST) {
      this.position = Position.of(position.getX(), position.getY() - 1, position.getDirection());
    }
    if (position.getDirection() == SOUTH) {
      this.position = Position.of(position.getX() - 1, position.getY(), position.getDirection());
    }
  }

  public void turnLeft() {
    this.position = Position.of(position.getX(), position.getY(), getNext(position.getDirection()));
  }

  public void turnRight() {
    this.position =
        Position.of(position.getX(), position.getY(), getPrevious(position.getDirection()));
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
          if (commander == Commander.TURN_RIGHT) {
            this.turnRight();
          }
        });
  }
}
