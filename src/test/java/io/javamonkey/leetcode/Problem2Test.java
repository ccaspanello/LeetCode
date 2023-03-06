package io.javamonkey.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import io.javamonkey.leetcode.p2.ListNode;
import org.junit.jupiter.api.Test;

public class Problem2Test {

  private final Problem2 problem = new Problem2();

  @Test
  public void test1() {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
    ListNode result = problem.addTwoNumbers(l1, l2);

    assertThat(result).isEqualTo(expected);
  }

  @Test
  public void test2() {
    ListNode l1 = new ListNode(0);
    ListNode l2 = new ListNode(0);
    ListNode expected = new ListNode(0);
    ListNode result = problem.addTwoNumbers(l1, l2);

    assertThat(result).isEqualTo(expected);
  }

  @Test
  public void test3() {
    ListNode l1 = convertToListNode("9999999");
    ListNode l2 = convertToListNode("9999");
    ListNode expected = convertToListNode("89990001");
    ListNode result = problem.addTwoNumbers(l1, l2);

    assertThat(result).isEqualTo(expected);
  }

  @Test
  public void testConvertToListNode(){
    ListNode expected = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode result = convertToListNode("243");

    assertThat(result).isEqualTo(expected);
  }

  private ListNode convertToListNode(String nums) {
    if(nums.length() == 1){
      return new ListNode(Integer.parseInt(nums));
    }else{
      int first = Integer.parseInt(nums.substring(0,1));
      String remaining = nums.substring(1);
      return new ListNode(first, convertToListNode(remaining));
    }
  }

}
