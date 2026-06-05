/*
Deletion of the head of LL
Easy

Hints
Company
Given the head of a singly linked list, delete the head of the linked list and return the head of the modified list. The head is the first node of the linked list.



Note : Please note that this section might seem a bit difficult without prior knowledge on what linkedList is, we will soon try to add basics concepts for your ease! If you know the concepts already please go ahead to give a shot to the problem. Cheers!


Example 1

Input: linkedList = [1, 2, 3]

Output: [2, 3]

Explanation:

The first node was removed.

Example 2

Input: linkedList = [1]

Output: []

Explanation:

Note that the head of the linked list gets changed.

Example 3

Input: linkedList = [7, 8]

Output:

[8]
Constraints

1 <= number of nodes in the Linked List <= 1000
0 <= ListNode.data<= 100
*/

/*
Defination of linked list
class ListNode {
    int data;
    ListNode next;

    ListNode() {
        this.data = 0;
        this.next = null;
    }

    ListNode(int x) {
        this.data = x;
        this.next = null;
    }

    ListNode(int x, ListNode next) {
        this.data = x;
        this.next = next;
    }
}
*/
class Solution {
    public ListNode deleteHead(ListNode head) {
        if(head == null) return null;
        return head = head.next;
    }
}