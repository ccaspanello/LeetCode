package io.javamonkey.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem 4: Median of Two Sorted Arrays
 */
public class Problem4 {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    List<Integer> nums = new ArrayList<>();
    appendToList(nums, nums1);
    appendToList(nums, nums2);
    Collections.sort(nums);
    int idx = nums.size() / 2;
    if(nums.size() % 2 == 0){
      double x1 = nums.get(idx-1);
      double x2 = nums.get(idx);
      return ( x1+ x2) / 2;
    }else{
      return nums.get(idx);
    }
  }
  private void appendToList(List<Integer> nums, int[] toAppend){
    for (int j : toAppend) {
      nums.add(j);
    }
  }

}
