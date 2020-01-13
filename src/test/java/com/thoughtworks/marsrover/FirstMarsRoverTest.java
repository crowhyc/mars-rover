package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.Direction.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 1.Rover 初始化，返回目前地点 与 朝向
 * 2.接收单个前进命令
 * 3-6 当火星车朝向 其他 3 个方向时前进结果正确
 * 7.批量接受命令，返回正确朝向和信息
 */
public class FirstMarsRoverTest {

  @Test
  public void return_X5_Y6_NORTH_for_init_MarsRover() {
    MarsRover marsRover = new MarsRover(5, 6, NORTH);
    assertEquals(marsRover.getPos(), Position.of(5, 6, NORTH));
  }

  @Test
  public void return_X6_Y6_NORTH_for_MarsRover_move_single_step() {
    MarsRover marsRover = new MarsRover(5, 6, NORTH);
    marsRover.moveForward();
    assertEquals(marsRover.getPos(), Position.of(6, 6, NORTH));
  }

  @Test
  public void return_X5_Y6_WEST_for_MarsRover_turn_left_1_time() {
    MarsRover marsRover = new MarsRover(5, 6, NORTH);
    marsRover.turnLeft();
    assertEquals(marsRover.getPos(), Position.of(5, 6, WEST));
  }
}
