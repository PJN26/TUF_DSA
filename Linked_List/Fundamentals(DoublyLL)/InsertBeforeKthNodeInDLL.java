/*
Insert node before (kth node) in Doubly Linked List
Easy

Hints
Company
Given the head of a doubly linked list and two integers X and K, insert a new node with value X, before the Kth node of the linked list and return the head of the modified linked list.


Example 1

Input: head = [1, 3, 5], X = 7, K = 2

Output: head = [1, 7, 3, 5]

Explanation: A node with value 7 was added before the 2nd node.

Example 2

Input: head = [5], X = 7, K = 1

Output: head = [7, 5]

Explanation: A node with value 7 was added, note that the head was changed.

Now your turn!

Input: head = [4, 5], X = 10, K = 2

Output:

Pick your answer


head -> 4 <-> 5 <-> 10

head -> 4 <-> 2 <-> 5

head -> 4 <-> 10 <-> 5

head -> 4 <-> 5 <-> 2
Constraints

n == Number of nodes in the linked list
1 <= n <= 100
0 <= ListNode.val <= 100
0 <= X <= 100
1 <= K <= n
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
    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        if(head == null) return new ListNode(X);

        if(K == 1) {
            ListNode newNode = new ListNode(X, null, head);
            head.prev = newNode;
            return newNode;
        }
        
        ListNode temp = head;
        int count = 1;

        while(temp != null && count < K - 1) {
            temp = temp.next;
            count++;
        }

        if(temp == null) return head;

        ListNode newNode = new ListNode(X, temp, temp.next);

        if(temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;

        return head;
    }
}