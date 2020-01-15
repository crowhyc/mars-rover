package com.thoughtworks.marsrover.second;

import java.util.List;

public class SecondMarsRover {

  private RoverPosition roverPosition;

  public SecondMarsRover(int xPos, int yPos, SecondDirection secondDirection) {
    this.roverPosition = new RoverPosition(xPos, yPos, secondDirection);
  }

  public void executeCommand(RoverCommand commander) {
    this.roverPosition = commander.getCommand().apply(this.roverPosition);
  }

  public RoverPosition getRoverPosition() {
    return this.roverPosition;
  }

  public void executeCommanders(List<RoverCommand> commandList) {
    commandList.forEach(this::executeCommand);
  }
}
