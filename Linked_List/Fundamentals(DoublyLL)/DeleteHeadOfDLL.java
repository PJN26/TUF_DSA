/*
Delete head of Doubly Linked List
Easy

Hints
Company
Given the head of a doubly linked list, remove the node at the head of the linked list and return the head of the modified list.



The head is the first node of the linked list.


Example 1

Input: doublyLinkedList = [1, 2, 3]

Output: [2, 3]

Explanation:

The node with value 1 was removed.
Example 2

Input: doublyLinkedList = [7]

Output: [ ]

Explanation:

Note that the head has null value after the removal.
Now your turn!

Input: doublyLinkedList = [2, 4]

Output:

Pick your answer


[2]

[null]

[2, 4]

[4]
Constraints

n == Number of nodes in the linked list
1 <= n <= 100
0 <= ListNode.data <= 100
*/

/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode deleteHead(ListNode head) {
        if(head == null || head.next == null) return null;
        head = head.next;
        head.prev = null;
        return head;
    }
}
