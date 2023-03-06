package io.javamonkey.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Problem5Test {

  private Problem5 problem = new Problem5();

  @Test
  public void test1() {
    String s = "babad";
    String expected = "bab";
    String result = problem.longestPalindrome(s);

    assertThat(result).isEqualTo(expected);
  }

  @Test
  public void test2() {
    String s = "cbbd";
    String expected = "bb";
    String result = problem.longestPalindrome(s);

    assertThat(result).isEqualTo(expected);
  }

}
