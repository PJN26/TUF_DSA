/*
Delete the element with value X
Easy

Hints
Company
Given the head of a singly linked list and an integer X, delete the node with value X and return the head of the modified list.


Example 1

Input: linkedList = [3, 4, 5], X = 5

Output: [3, 4]

Explanation:

The node with value 5 was removed.

Example 2

Input: linkedList = [3, 4, 5], X = 7

Output: [3, 4, 5]

Explanation:

No nodes were removed.

Now your turn!

Input: linkedList = [3, 4, 5], X = 3

Output:

Correct

[3, 4, 5, 3]

[3, 5]

[3, 4]

[4, 5]
Constraints

n == number of nodes in the Linked list
1 <= n <= 1000
0 <= ListNode.val <= 100
0 <= X <= 100
Number of nodes with value X is either 0 or 1
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
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if(head == null) return null;

        if(head.data == X) {
            return head = head.next;
        }

        ListNode temp = head;

        while(temp.next != null && temp.next.data != X) {
            temp = temp.next;
        }

        if(temp.next == null) return head;

        ListNode next = temp.next.next;
        temp.next = next;

        return head;

    }
}