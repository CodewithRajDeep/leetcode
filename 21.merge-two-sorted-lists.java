/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
import java.util.ArrayList;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int key;
	ListNode next;

	public Node(int key) {
		this.key = key;
		this.next = null;
	} 
     ListNode(int key) 
     { this.val = val; 
  this.val = val; this.next = next; }
 


		return new Node(key);
	}

    public static void main(String arg[]) {

        Node n = new node();
        List m = new ArrayList();
        while (n != null) {

            m.add(key);
            key = key.next;
        }

        Result.sort(m);
        Node result = new Node(-1);
        Node temp = result;
        for (int i = 0; i < m.size(); i++) {
            result.next = new Node(m.get(i));
            result = result.next;
        }

        temp = temp.next;
        System.out.print("Resultant Merge Linked List is : ");
        while (temp != null) {
            System.out.print(temp.key + " ");
            temp = temp.next;
        }
    }
}
// @lc code=end
