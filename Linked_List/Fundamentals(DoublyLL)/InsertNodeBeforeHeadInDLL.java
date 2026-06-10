/*
Insert node before head in Doubly Linked List
Easy

Hints
Company
Given the head of a doubly linked list and an integer X, insert a node with value X before the head of the linked list and return the head of the modified list.


Example 1

Input: head = [1, 2, 3], X = 3

Output: head = [3, 1, 2, 3]

Explanation: 3 was added before the 1st node. Note that the head's value is changed.

Example 2

Input: head = [5], X = 7

Output: head = [7, 5]

Now your turn!

Input: head = [2, 3], X = 10

Output:

Pick your answer


10 -> head <-> 2 <-> 3

head -> 2 <-> 10 <-> 3

head -> 10 <-> 2 <-> 3

head -> 2 <-> 3 <-> 10
Constraints

n == Number of nodes in the Linked List
1 <= n <= 100
0 <= ListNode.val <= 100
0 <= X <= 100
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
    public ListNode insertBeforeHead(ListNode head, int data) {
        if(head == null) return new ListNode(data);

        ListNode newNode = new ListNode(data, null, head);
        head.prev = newNode;
        head = newNode;

        return head;
    }
}