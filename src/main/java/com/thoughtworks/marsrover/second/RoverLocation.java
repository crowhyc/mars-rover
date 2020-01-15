package com.thoughtworks.marsrover.second;

import java.util.Objects;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
public class RoverLocation {
  private int x;
  private int y;

  public RoverLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoverLocation that = (RoverLocation) o;
    return x == that.x &&
        y == that.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
