package be.inniger.advent.solutions;

import static java.lang.Math.abs;

import java.util.List;

import be.inniger.advent.DailyProblem;

// Hex calculations based on https://www.redblobgames.com/grids/hexagons/
public class Day11 implements DailyProblem<List<String>, Integer> {

  @Override
  public Integer solveFirst(List<String> inputs) {
    return solve(inputs).finalPosition.distanceToCenter();
  }

  @Override
  public Integer solveSecond(List<String> inputs) {
    return solve(inputs).furthestPosition.distanceToCenter();
  }

  private HexPositionPair solve(List<String> inputs) {
    HexPosition position = HexPosition.center();
    HexPosition furthestPosition = null;
    int furthestDistance = 0;

    for (String direction : inputs) {
      position = position.move(direction);
      int distance = position.distanceToCenter();

      if (distance > furthestDistance) {
        furthestDistance = distance;
        furthestPosition = position;
      }
    }

    return new HexPositionPair(position, furthestPosition);
  }

  private static class HexPosition {

    private final int q;
    private final int r;

    // Should not be called directly, use center() instead
    private HexPosition(int q, int r) {
      this.q = q;
      this.r = r;
    }

    private static HexPosition center() {
      return new HexPosition(0, 0);
    }

    private HexPosition move(String direction) {
      switch (direction) {
        case "n":
          return new HexPosition(q, r - 1);
        case "ne":
          return new HexPosition(q + 1, r - 1);
        case "se":
          return new HexPosition(q + 1, r);
        case "s":
          return new HexPosition(q, r + 1);
        case "sw":
          return new HexPosition(q - 1, r + 1);
        case "nw":
          return new HexPosition(q - 1, r);
        default:
          throw new IllegalArgumentException();
      }
    }

    private int distanceToCenter() {
      return distanceTo(center());
    }

    private int distanceTo(HexPosition that) {
      return (abs(this.q - that.q)
          + abs(this.q + this.r - that.q - that.r)
          + abs(this.r - that.r)) / 2;
    }
  }

  private static class HexPositionPair {

    private final HexPosition finalPosition;
    private final HexPosition furthestPosition;

    private HexPositionPair(HexPosition finalPosition, HexPosition furthestPosition) {
      this.finalPosition = finalPosition;
      this.furthestPosition = furthestPosition;
    }
  }
}
