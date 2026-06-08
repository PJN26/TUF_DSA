/*
Insertion at the tail of Linked List
Easy

Hints
Company
Given the head of a singly linked list and an integer X, insert a node with value X at the tail of the linked list and return the head of the modified list.


Example 1

Input: linkedList = [1, 2, 3], X = 7

Output: [1, 2, 3, 7]

Explanation:

7 was added as the last node.

Example 2

Input: linkedList = [], X = 0

Output: [0]

Explanation:

0 was added as the last/only node.

Now your turn!

Input: linkedList = [5, 6], X = 8

Output:

Pick your answer


[5, 8, 6]

[8, 6, 5]

[8, 5, 6]

[5, 6, 8]
Constraints

0 <= number of nodes in the Linked List <= 1000
0 <= ListNode.val <= 100
0 <= X <= 100
*/

/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode insertAtTail(ListNode head, int X) {
        if(head == null) return new ListNode(X);
        ListNode newNode = new ListNode(X);
        ListNode temp = head;

        while(temp.next != null) temp = temp.next;

        temp.next = newNode;

        return head;
    }
}