package com.thoughtworks.marsrover;

public class Position {
  private int x;
  private int y;
  private Direction direction;

  private Position() {}

  public static Position of(int x, int y, Direction direction) {
    Position position = new Position();
    position.x = x;
    position.y = y;
    position.direction = direction;
    return position;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Direction getDirection() {
    return direction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return x == position.x && y == position.y && direction == position.direction;
  }
}
