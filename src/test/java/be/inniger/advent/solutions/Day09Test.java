package be.inniger.advent.solutions;

import static be.inniger.advent.util.InputFileReader.readSingleLine;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import be.inniger.advent.DailyTest;

public class Day09Test extends DailyTest {

  private final Day09 problem = new Day09();

  @Override
  @Test
  public void validateFirstSampleInputs() {
    assertThat(problem.solveFirst("{}"))
        .isEqualTo(1);

    assertThat(problem.solveFirst("{{{}}}"))
        .isEqualTo(6);

    assertThat(problem.solveFirst("{{},{}}"))
        .isEqualTo(5);

    assertThat(problem.solveFirst("{{{},{},{{}}}}"))
        .isEqualTo(16);

    assertThat(problem.solveFirst("{<a>,<a>,<a>,<a>}"))
        .isEqualTo(1);

    assertThat(problem.solveFirst("{{<ab>},{<ab>},{<ab>},{<ab>}}"))
        .isEqualTo(9);

    assertThat(problem.solveFirst("{{<!!>},{<!!>},{<!!>},{<!!>}}"))
        .isEqualTo(9);

    assertThat(problem.solveFirst("{{<a!>},{<a!>},{<a!>},{<ab>}}"))
        .isEqualTo(3);
  }

  @Override
  @Test
  public void validateFirstSolution() {
    assertThat(problem.solveFirst(readSingleLine(FILE_NAME)))
        .isEqualTo(14190);
  }

  @Override
  @Test
  public void validateSecondSampleInputs() {
    assertThat(problem.solveSecond("<>"))
        .isEqualTo(0);

    assertThat(problem.solveSecond("<random characters>"))
        .isEqualTo(17);

    assertThat(problem.solveSecond("<<<<>"))
        .isEqualTo(3);

    assertThat(problem.solveSecond("<{!>}>"))
        .isEqualTo(2);

    assertThat(problem.solveSecond("<!!>"))
        .isEqualTo(0);

    assertThat(problem.solveSecond("<!!!>>"))
        .isEqualTo(0);

    assertThat(problem.solveSecond("<{o\"i!a,<{i<a>"))
        .isEqualTo(10);
  }

  @Override
  @Test
  public void validateSecondSolution() {
    assertThat(problem.solveSecond(readSingleLine(FILE_NAME)))
        .isEqualTo(7053);
  }
}
