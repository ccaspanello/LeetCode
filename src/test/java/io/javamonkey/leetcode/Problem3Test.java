package io.javamonkey.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Problem3Test {

  private final Problem3 problem = new Problem3();

  @Test
  public void test1() {
    int expected = 3;
    int result = problem.lengthOfLongestSubstring("abcabcbb");

    assertThat(result).isEqualTo(expected);
  }

  @Test
  public void test2() {
    int expected = 1;
    int result = problem.lengthOfLongestSubstring("bbbbb");

    assertThat(result).isEqualTo(expected);
  }

  @Test
  public void test3() {
    int expected = 3;
    int result = problem.lengthOfLongestSubstring("pwwkew");

    assertThat(result).isEqualTo(expected);
  }

}
