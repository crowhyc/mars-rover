package com.thoughtworks.marsrover.second;

import java.util.function.Function;

public enum RoverCommand {
  MOVE(
      (RoverPosition location) -> {
        switch (location.getDirection()) {
          case NORTH:
            return new RoverPosition(location.getX() + 1, location.getY(), location.getDirection());
          case WEST:
            return new RoverPosition(location.getX(), location.getY() - 1, location.getDirection());
          case SOUTH:
            return new RoverPosition(location.getX() - 1, location.getY(), location.getDirection());
          case EAST:
            return new RoverPosition(location.getX(), location.getY() + 1, location.getDirection());
        }
        return location;
      }),
  TURN_LEFT(
      (RoverPosition loc) ->
          new RoverPosition(loc.getX(), loc.getY(), loc.getDirection().getNext())),
  TURN_RIGHT(
      (RoverPosition loc) ->
          new RoverPosition(loc.getX(), loc.getY(), loc.getDirection().getPrevious()));

  private Function<RoverPosition, RoverPosition> command;

  RoverCommand(Function<RoverPosition, RoverPosition> command) {
    this.command = command;
  }

  public Function<RoverPosition, RoverPosition> getCommand() {
    return command;
  }
}
