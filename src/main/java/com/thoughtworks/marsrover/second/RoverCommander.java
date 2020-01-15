package com.thoughtworks.marsrover.second;

import java.util.function.Function;

public class RoverCommander {
  private Function<RoverLocation, RoverLocation> commander;

  public RoverCommander(Function<RoverLocation, RoverLocation> function) {
    this.commander = function;
  }

  public RoverLocation execute(RoverLocation roverLocation) {
    return commander.apply(roverLocation);
  }
}
