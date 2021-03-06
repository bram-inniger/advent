package be.inniger.advent.solutions;

import static be.inniger.advent.util.InputFileReader.readSingleLine;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

import be.inniger.advent.DailyTest;

public class Day03Test extends DailyTest {

  private final Day03 problem = new Day03();

  @Override
  @Test
  public void validateFirstSampleInputs() {
    assertThat(problem.solveFirst(1))
        .isEqualTo(0);

    assertThat(problem.solveFirst(12))
        .isEqualTo(3);

    assertThat(problem.solveFirst(23))
        .isEqualTo(2);

    assertThat(problem.solveFirst(1024))
        .isEqualTo(31);
  }

  @Override
  @Test
  public void validateFirstSolution() {
    assertThat(problem.solveFirst(readSingleLine(FILE_NAME, Integer::parseInt)))
        .isEqualTo(438);
  }

  @Override
  @Ignore("These don't make sense, as the actual method calculates the next value surpassing the given input")
  @Test
  public void validateSecondSampleInputs() {
    assertThat(problem.solveSecond(1))
        .isEqualTo(1);

    assertThat(problem.solveSecond(2))
        .isEqualTo(1);

    assertThat(problem.solveSecond(3))
        .isEqualTo(2);

    assertThat(problem.solveSecond(4))
        .isEqualTo(4);

    assertThat(problem.solveSecond(5))
        .isEqualTo(5);
  }

  @Override
  @Test
  public void validateSecondSolution() {
    assertThat(problem.solveSecond(readSingleLine(FILE_NAME, Integer::parseInt)))
        .isEqualTo(266330);
  }
}
