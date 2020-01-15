package com.thoughtworks.marsrover.second;

import java.util.Arrays;

public enum SecondDirection {
  NORTH(1),
  WEST(2),
  SOUTH(3),
  EAST(4);

  private int idx;

  SecondDirection(int idx) {
    this.idx = idx;
  }

  public SecondDirection getPrevious() {
    if (this.idx == 1) {
      return EAST;
    }
    return Arrays.stream(SecondDirection.values())
        .filter(d -> d.idx == this.idx - 1)
        .findFirst()
        .get();
  }

  public SecondDirection getNext() {
    if (this.idx == 4) {
      return NORTH;
    }
    return Arrays.stream(SecondDirection.values())
        .filter(d -> d.idx == this.idx + 1)
        .findFirst()
        .get();
  }
}
