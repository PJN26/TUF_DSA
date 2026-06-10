/*
Insert node before tail in Doubly Linked List
Easy

Hints
Company
Given the head of a doubly linked list and an integer X, insert a node with value X before the tail of the linked list and return the head of the modified list.


Example 1

Input: head = [1, 2, 4], X = 3

Output: head = [1, 2, 3, 4]

Explanation: 3 was added before the last node.

Example 2

Input: head = [4], X = 6

Output: head = [6, 4]

Explanation: 6 was added before 4, note that the head was changed as a result.

Now your turn!

Input: head = [4, 5], X = 6

Output:

Pick your answer


head -> 4 <-> 5 <-> 6

head -> 4 <-> 6 <-> 5

head -> 6 <-> 4 <-> 5

head -> 4 <-> 5 <-> 0 <-> 0 <-> 0 <-> 6
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
    public ListNode insertBeforeTail(ListNode head, int X) {
        if(head == null) return new ListNode(X);
        if(head.next == null) {
            ListNode newNode = new ListNode(X, null, head);
            head.prev = newNode;
            head = newNode;
            return head;
        }

        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        ListNode newNode = new ListNode(X, temp.prev, temp);
        temp.prev.next = newNode;
        temp.prev = newNode;
        return head;
    }
}
