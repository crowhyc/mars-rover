package com.thoughtworks.marsrover;

import static junit.framework.Assert.assertEquals;

import com.thoughtworks.marsrover.second.RoverCommander;
import com.thoughtworks.marsrover.second.RoverLocation;
import com.thoughtworks.marsrover.second.SecondMarsRover;
import org.junit.Test;

public class SecondMarsRoverTest {

  @Test
  public void return_x6_y6_NORTH_for_receive_move_commander() {
    SecondMarsRover marsRover = new SecondMarsRover(5, 6);
    RoverCommander commander =
        new RoverCommander(
            (RoverLocation location) -> new RoverLocation(location.getX() + 1, location.getY()));
    marsRover.executeCommander(commander);
    assertEquals(marsRover.getRoverLocation(), new RoverLocation(6, 6));
  }
}
