package com.thoughtworks.marsrover;

import java.util.Arrays;

public enum Direction {
  NORTH(1),
  WEST(2),
  SOUTH(3),
  EAST(4),
  ;

  private int idx;

  Direction(int idx) {
    this.idx = idx;
  }

  public static Direction getPrevious(Direction direction) {
    if (direction.getIdx() == 1) {
      return EAST;
    }
    return Arrays.stream(Direction.values())
        .filter(d -> d.idx == direction.getIdx() - 1)
        .findFirst()
        .get();
  }

  public int getIdx() {
    return idx;
  }

  public static Direction getNext(Direction direction) {
    if (direction.getIdx() == 4) {
      return NORTH;
    }
    return Arrays.stream(Direction.values())
        .filter(d -> d.idx == direction.getIdx() + 1)
        .findFirst()
        .get();
  }
}
