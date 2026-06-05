/*
Deletion of the tail of Linked List
Easy

Hints
Company
Given the head of a singly linked list, delete the tail of the linked list and return the head of the modified list.



The tail is the last node of the linked list.


Example 1

Input: linkedList = [1, 2, 3]

Output: [1, 2]

Explanation:

The last node was removed.

Example 2

Input: linkedList = [1]

Output: []

Explanation:

Note that the value of head is null here.

Now your turn!

Input: linkedList = [7, 8]

Output:

Pick your answer


[7, 8]

[8]

[7]

[8, 7]
Constraints

1 <= number of nodes in the Linked List <= 1000
0 <= ListNode.val <= 100
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
    public ListNode deleteTail(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode temp = head;

        while(temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }
}