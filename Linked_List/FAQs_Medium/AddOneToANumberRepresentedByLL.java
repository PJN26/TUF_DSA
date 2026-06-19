/*
Add one to a number represented by LL
Medium

Hints
Company
Given the head of a singly linked list representing a positive integer number. Each node of the linked list represents a digit of the number, with the 1st node containing the leftmost digit of the number and so on. The task is to add one to the value represented by the linked list and return the head of a linked list containing the final value.



The number will contain no leading zeroes except when the value represented is zero itself.


Example 1

Input: head -> 1 -> 2 -> 3

Output: head -> 1 -> 2 -> 4

Explanation: The number represented by the linked list = 123.

123 + 1 = 124.

Example 2

Input: head -> 9 -> 9

Output: head -> 1 -> 0 -> 0

Explanation: The number represented by the linked list = 99.

99 + 1 = 100.

Example 3

Input: head -> 9

Output:

head -> 1 -> 0
Constraints

0 <= number of nodes in the Linked List <= 105
0 <= ListNode.val <= 9
No leading zeroes in the value represented.
*/


/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public int addHelper(ListNode head) {
        if(head == null) return 1;
        int carry = addHelper(head.next);

        if(carry == 1) {
            head.val += 1;
        }

        if(head.val >= 10) {
            carry = 1;
            head.val = 0;
        } else {
            carry = 0;
        }
        return carry;
    }
    public ListNode addOne(ListNode head) {
        int carry = addHelper(head);

        if(carry == 1) {
            return new ListNode(1, head);
        } else {
            return head;
        }
    }
}