package io.javamonkey.leetcode.p2;

import lombok.Data;

@Data
public class ListNode {
  private int val;
  private ListNode next;

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}