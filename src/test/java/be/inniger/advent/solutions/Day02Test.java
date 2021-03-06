package be.inniger.advent.solutions;

import static be.inniger.advent.util.InputFileReader.readMultiLine;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import be.inniger.advent.DailyTest;

public class Day02Test extends DailyTest {

  private final Day02 problem = new Day02();

  @Override
  @Test
  public void validateFirstSampleInputs() {
    assertThat(problem.solveFirst(asList(
        "5 1 9 5",
        "7 5 3",
        "2 4 6 8"
    )))
        .isEqualTo(18);
  }

  @Override
  @Test
  public void validateFirstSolution() {
    assertThat(problem.solveFirst(readMultiLine(FILE_NAME)))
        .isEqualTo(36766);
  }

  @Override
  @Test
  public void validateSecondSampleInputs() {
    assertThat(problem.solveSecond(asList(
        "5 9 2 8",
        "9 4 7 3",
        "3 8 6 5"
    )))
        .isEqualTo(9);
  }

  @Override
  @Test
  public void validateSecondSolution() {
    assertThat(problem.solveSecond(readMultiLine(FILE_NAME)))
        .isEqualTo(261);
  }
}
