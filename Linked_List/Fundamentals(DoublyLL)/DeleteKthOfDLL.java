/*
Delete Kth Element of Doubly Linked List
Easy

Hints
Company
Given the head of a doubly linked list and an integer k, remove the node at the kth position of the linked list and return the head of the modified list.


Example 1

Input: head = [2, 5, 7, 9], k = 2

Output: head = [2, 7, 9]

Explanation:

The node with value 5 was removed.
Example 2

Input: head = [2, 5, 7], k = 1

Output: head = [5, 7]

Explanation:

The node with value 2 was removed, note that the head was modified.

Now your turn!

Input: head = [2, 5, 7], k = 3

Output:

Pick your answer


head -> 5 <-> 7

head -> 2 <-> 5

head

head -> 2 <-> 7
Constraints

n == Number of nodes in the linked list
1 <= n <= 100
0 <= ListNode.val <= 100
1 <= k <= n
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
    public ListNode deleteKthElement(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;

        while(temp != null) {
            count++;
            if(count == k) break;
            temp = temp.next;
        }

        ListNode prev = temp.prev;
        ListNode front = temp.next;
        
        if(prev == null && front == null) return null;
        else if(prev == null) {
            head = front;
            front.prev = null;
        }
        else if(front == null) {
            prev.next = null;
        } else {
            prev.next = front;
            front.prev = prev;
        }
        return head;
    }
}