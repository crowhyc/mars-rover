package com.thoughtworks.marsrover.second;

import java.util.function.Function;

public class SecondMarsRover {

  private RoverPosition roverPosition;

  public SecondMarsRover(int xPos, int yPos, SecondDirection secondDirection) {
    this.roverPosition = new RoverPosition(xPos, yPos, secondDirection);
  }

  public void executeCommander(Function<RoverPosition, RoverPosition> commander) {
    this.roverPosition = commander.apply(this.roverPosition);
  }

  public RoverPosition getRoverPosition() {
    return this.roverPosition;
  }
}
