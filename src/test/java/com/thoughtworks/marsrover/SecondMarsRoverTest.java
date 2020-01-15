package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.second.SecondDirection.EAST;
import static com.thoughtworks.marsrover.second.SecondDirection.NORTH;
import static com.thoughtworks.marsrover.second.SecondDirection.WEST;
import static junit.framework.Assert.assertEquals;

import com.thoughtworks.marsrover.second.RoverCommand;
import com.thoughtworks.marsrover.second.RoverPosition;
import com.thoughtworks.marsrover.second.SecondMarsRover;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.spec.RC2ParameterSpec;
import org.junit.Test;

public class SecondMarsRoverTest {

  @Test
  public void return_x6_y6_NORTH_for_receive_move_command() {
    SecondMarsRover marsRover = new SecondMarsRover(5, 6, NORTH);
    marsRover.executeCommand( RoverCommand.MOVE);
    assertEquals(marsRover.getRoverPosition(), new RoverPosition(6, 6, NORTH));
  }

  @Test
  public void return_x5_y6_WEST_receive_turn_left_command() {
    SecondMarsRover marsRover = new SecondMarsRover(5, 6, NORTH);
    marsRover.executeCommand(RoverCommand.TURN_LEFT);
    assertEquals(marsRover.getRoverPosition(), new RoverPosition(5, 6, WEST));
  }

  @Test
  public void return_x5_y6_EAST_for_receive_turn_right_command() {
    SecondMarsRover marsRover = new SecondMarsRover(5, 6, NORTH);
    marsRover.executeCommand(RoverCommand.TURN_RIGHT);
    assertEquals(marsRover.getRoverPosition(), new RoverPosition(5, 6, EAST));
  }

  @Test
  public void return_x7_y6_EAST_for_receive_multiple_commands() {
    SecondMarsRover marsRover = new SecondMarsRover(5, 6, NORTH);
    List<RoverCommand> commandList = new ArrayList<>();
    commandList.add(RoverCommand.MOVE);
    commandList.add(RoverCommand.MOVE);
    commandList.add(RoverCommand.TURN_LEFT);
    marsRover.executeCommanders(commandList);
    assertEquals(marsRover.getRoverPosition(), new RoverPosition(7, 6, WEST));
  }
}
