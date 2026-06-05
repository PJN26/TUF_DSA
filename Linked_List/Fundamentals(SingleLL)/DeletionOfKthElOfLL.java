/*
Deletion of the Kth element of Linked List
Easy

Hints
Company
Given the head of a singly linked list and an integer k, delete the kth node of the linked list and return the head of the modified list.


Example 1

Input: linkedList = [3, 4, 5], k = 2

Output: linkedList = [3, 5]

Explanation:

The 2nd node with value 4 was removed.

Example 2

Input: linkedList = [1, 2, 3], k = 1

Output: [2, 3]

Explanation:

The 1st Node was removed, note that the value of the head has changed.

Now your turn!

Input: linkedList = [7, 7, 7], k = 3

Output:

Pick your answer


[7, 7]

[7]

[7, 7, 7]

[]
Constraints

n == number of nodes in the Linked list
1 <= n <= 1000
0 <= ListNode.val <= 100
1 <= k <= n
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
    public ListNode deleteKthNode(ListNode head, int k) {
        if(head == null) return null;

        if(k == 1) {
            return head = head.next;
        }

        ListNode temp = head;

        for(int i = 0; i < k - 2; i++) {
            temp = temp.next;
        }

        if(temp == null || temp.next == null) return head;

        ListNode next = temp.next.next;
        temp.next = next;

        return head;
    }
}