/*
Delete Tail of Doubly Linked List
Easy

Hints
Company
Given the head of a doubly linked list, remove the node at the tail of the linked list and return the head of the modified list.



The tail is the last node of the linked list.


Example 1

Input: head = [1, 2, 3]

Output: head = [1, 2]

Explanation:

The node with value 3 was removed.
Example 2

Input: head = [7]

Output: head = [ ]

Explanation:

Note that the head has null value after the removal.
Now your turn!

Input: head = [2, 4]

Output:

Correct

head -> 4

head <-> 4

head -> 4 <-> 2

head -> 2
Constraints

n == Number of nodes in the linked list
1 <= n <= 100
0 <= ListNode.val <= 100
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
    public ListNode deleteTail(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }

        temp.next.prev = null;
        temp.next = null;

        return head;
    }
}