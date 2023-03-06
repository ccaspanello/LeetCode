package io.javamonkey.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem 3: Longest Substring Without Repeating Characters
 */
public class Problem3 {

  public int lengthOfLongestSubstring(String s) {
    int result = 0;
    int left = 0;
    int right = 0;
    Set<Character> substring = new HashSet<>();
    while (right < s.length()) {
      char currentChar = s.charAt(right);
      if (!substring.contains(currentChar)) {
        substring.add(currentChar);
        right++;
        result = Math.max(result, substring.size());
      } else {
        substring.remove(s.charAt(left));
        left++;
      }
    }
    return result;
  }

}
