/*
Removing given node in Doubly Linked List
Easy

Hints
Company
Given a node's reference within a doubly linked list, remove that node from the linked list while preserving the list's integrity.



You will only be given the node's reference, not the head of the list. It is guaranteed that the given node will not be the head of the list.


Example 1

Input: head = [1, 3, 5], node = 3

Output: [1, 5]

Explanation:

The referenced node with value 3 was removed.
Example 2

Input: head = [1, 3, 7], node = 7

Output: head = [1, 3]

Explanation:

The referenced node with value 7 was removed.
Now your turn!

Input: head = [1, 5], node = 5

Output:

Correct

head -> 5

head

head -> 1

head -> 1 <-> 2 <-> 5
Constraints

2 <= Number of nodes in the list <= 100
0 <= ListNode.val <= 100
Node is guaranteed to be a part of the linked list and will not be the head
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
    public void deleteGivenNode(ListNode node) {
        ListNode prev = node.prev;
        ListNode front = node.next;

        if(front == null) {
            prev.next = null;
            node.prev = null;
            return;
        }

        prev.next = front;
        front.prev = prev;
        node.next = null;
        node.prev = null;
    }
}