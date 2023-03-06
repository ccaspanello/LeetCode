package io.javamonkey.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 1: Two Sum
 */
public class Problem1 {

  public int[] twoSum(int[] nums, int target){
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i < nums.length; i ++){
      int toLookFor = target - nums[i];
      if(map.containsKey(toLookFor)){
        return new int[]{map.get(toLookFor), i};
      } else{
        map.put(nums[i], i);
      }
    }
    return null;
  }

}
