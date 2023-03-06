package io.javamonkey.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Problem1Test {

  private final Problem1 problem = new Problem1();

  @Test
  public void test1(){
    int[] nums = {2,7,11,15};
    int target = 9;
    int[] expected = {0,1};
    int[] result = problem.twoSum(nums, target);

    assertThat(result).isEqualTo(expected);
  }

  @Test
  public void test2(){
    int[] nums = {3,2,4};
    int target = 6;
    int[] expected = {1,2};
    int[] result = problem.twoSum(nums, target);

    assertThat(result).isEqualTo(expected);
  }


  @Test
  public void test3(){
    int[] nums = {3,3};
    int target = 6;
    int[] expected = {0,1};
    int[] result = problem.twoSum(nums, target);

    assertThat(result).isEqualTo(expected);
  }
}
