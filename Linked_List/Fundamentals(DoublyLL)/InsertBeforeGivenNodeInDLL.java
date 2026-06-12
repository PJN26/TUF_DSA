/*
Insert before given node in Doubly Linked List
Easy

Hints
Company
Given a node's reference within a doubly linked list and an integer X, insert a node with value X before the given node in the linked list while preserving the list's integrity.



You will only be given the node's reference, not the head of the list. It is guaranteed that the given node will not be the head of the list.


Example 1

Input: head = [1, 2, 6], node = 6, X = 7

Output: head = [1, 2, 7, 6]

Explanation: Note that the head was not given to the function.

Example 2

Input: head = [7, 5, 15], node = 5, X = 10

Output: head = [7, 10, 5, 15]

Explanation: The node with value 5 was referenced, thus the new node was added before the given node.

Now your turn!

Input: head = [7, 6, 5], node = 5, X = 10

Output:

Correct

head -> 7 <-> 6 <-> 5 <-> 10

head -> 7 <-> 6 <-> 5 <-> 5

head -> 7 <-> 6 <-> 10

head -> 7 <-> 6 <-> 10 <-> 5
Constraints

n == Number of nodes in the Linked List
2 <= n <= 100
0 <= ListNode.val <= 100
0 <= X <= 100
It is guaranteed the given node will be a part of a doubly linked list and will not be its head.
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
    public void insertBeforeGivenNode(ListNode node, int X) {
        ListNode newNode = new ListNode(X, node.prev, node);
        node.prev.next = newNode;
        node.prev = newNode;
    }
}