package com.thoughtworks.marsrover.second;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class RoverPosition {
  private int x;
  private int y;
  private SecondDirection direction;

  public RoverPosition(int x, int y, SecondDirection direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }
}
