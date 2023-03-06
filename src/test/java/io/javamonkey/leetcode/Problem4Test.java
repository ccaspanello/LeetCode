package io.javamonkey.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Problem4Test {

  private Problem4 problem = new Problem4();

  @Test
  public void test1() {
    int[] nums1 = {1,3};
    int[] nums2 = {2};
    double expected = 2.0;
    double result = problem.findMedianSortedArrays(nums1, nums2);

    assertThat(result).isEqualTo(expected);
  }

  @Test
  public void test2() {
    int[] nums1 = {1,2};
    int[] nums2 = {3,4};
    double expected = 2.5;
    double result = problem.findMedianSortedArrays(nums1, nums2);

    assertThat(result).isEqualTo(expected);
  }


}
