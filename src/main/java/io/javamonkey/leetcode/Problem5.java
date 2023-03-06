package io.javamonkey.leetcode;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;

/**
 * Problem5: Longest Palindromic Substring
 */
@Slf4j
public class Problem5 {

  public String longestPalindrome(String s) {
    String longest = "";
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        String substring = s.substring(i, j + 1);
        String reversed = reverse(substring);
        if (substring.equals(reversed) && reversed.length() > longest.length()) {
          longest = reversed;
        }
      }
    }
    return longest;
  }

  private String reverse(String s) {
    String result = "";
    for (int i = s.length(); i > 0; i--) {
      result = result + s.charAt(i - 1);
    }
    return result;
  }

}
