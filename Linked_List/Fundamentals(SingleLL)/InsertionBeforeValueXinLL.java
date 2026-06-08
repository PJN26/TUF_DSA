/*
Insertion before the value X in Linked List
Easy

Hints
Company
Given the head of a singly linked list and two integers X and val.



Insert a node with value val before the node with value X in the linked list and return the head of the modified list.


Example 1

Input: linkedList = [1, 2, 3], X = 2, val = 5

Output: [1, 5, 2, 3]

Explanation:

The node with value 5 was added before the node with value 2

Example 2

Input: linkedList = [1, 2, 3], X = 7, val = 5

Output: [1, 2, 3]

Explanation:

No node was added as X was not found in the list.

Now your turn!

Input: linkedList = [1], X = 1, val = 10

Output:

Correct

[1, 10]

[1, 1]

[10, 1]

[10]
Constraints

n == number of nodes in the Linked List
1 <= n <= 1000
0 <= ListNode.val <= 100
0 <= X <= 100
0 <= val <= 100
Number of nodes with value X is 0 or 1
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
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if(head == null) return null;

        if(head.data == X) {
            return new ListNode(val, head);
        }

        ListNode temp = head;

        while(temp.next != null && temp.next.data != X) {
            temp = temp.next;
        }

        if(temp.next == null) return head;

        ListNode newNode = new ListNode(val, temp.next);
        temp.next = newNode;

        return head;
    }
}