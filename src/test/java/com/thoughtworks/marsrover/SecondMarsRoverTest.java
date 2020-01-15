package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.second.SecondDirection.EAST;
import static com.thoughtworks.marsrover.second.SecondDirection.NORTH;
import static com.thoughtworks.marsrover.second.SecondDirection.WEST;
import static junit.framework.Assert.assertEquals;

import com.thoughtworks.marsrover.second.RoverPosition;
import com.thoughtworks.marsrover.second.SecondMarsRover;
import org.junit.Test;

public class SecondMarsRoverTest {

  @Test
  public void return_x6_y6_NORTH_for_receive_move_command() {
    SecondMarsRover marsRover = new SecondMarsRover(5, 6, NORTH);
    marsRover.executeCommander(
        (RoverPosition location) ->
            new RoverPosition(location.getX() + 1, location.getY(), location.getDirection()));
    assertEquals(marsRover.getRoverPosition(), new RoverPosition(6, 6, NORTH));
  }

  @Test
  public void return_x5_y6_WEST_receive_turn_left_command() {
    SecondMarsRover marsRover = new SecondMarsRover(5, 6, NORTH);
    marsRover.executeCommander(
        (RoverPosition loc) ->
            new RoverPosition(loc.getX(), loc.getY(), loc.getDirection().getNext()));
    assertEquals(marsRover.getRoverPosition(), new RoverPosition(5, 6, WEST));
  }

  @Test
  public void return_x5_y6_EAST_for_receive_turn_right_command() {
    SecondMarsRover marsRover = new SecondMarsRover(5, 6, NORTH);
    marsRover.executeCommander(
        (RoverPosition loc) ->
            new RoverPosition(loc.getX(), loc.getY(), loc.getDirection().getPrevious()));
    assertEquals(marsRover.getRoverPosition(), new RoverPosition(5, 6, EAST));
  }
}
