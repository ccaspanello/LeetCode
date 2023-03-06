package io.javamonkey.leetcode;

import io.javamonkey.leetcode.p2.ListNode;
import java.math.BigInteger;

/**
 * Problem 2: Add Two Numbers
 */
public class Problem2 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    String num1 = convert(l1);
    String num2 = convert(l2);
    BigInteger bigInt1 = new BigInteger(num1);
    BigInteger bigInt2 = new BigInteger(num2);
    BigInteger sum = bigInt1.add(bigInt2);
    return construct(String.valueOf(sum));
  }

  private String convert(ListNode node) {
    if (node.getNext() == null) {
      return "" + node.getVal();
    } else {
      return convert(node.getNext()) + node.getVal();
    }
  }

  private ListNode construct(String sum) {
    if (sum.length() == 1) {
      return new ListNode(Integer.parseInt(sum));
    } else {
      int val = Integer.parseInt("" + sum.charAt(sum.length() - 1));
      String newSum = sum.substring(0, sum.length() - 1);
      return new ListNode(val, construct(newSum));
    }
  }


}
