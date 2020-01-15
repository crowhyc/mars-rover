package com.thoughtworks.marsrover.second;

public class SecondMarsRover {

  private RoverLocation roverLocation;

  public SecondMarsRover(int xPos, int yPos) {
    this.roverLocation = new RoverLocation(xPos, yPos);
  }

  public void executeCommander(RoverCommander commander) {
    this.roverLocation = commander.execute(this.roverLocation);
  }

  public RoverLocation getRoverLocation() {
    return this.roverLocation;
  }
}
