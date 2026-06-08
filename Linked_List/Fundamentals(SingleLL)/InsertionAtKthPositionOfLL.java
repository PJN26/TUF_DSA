/*
Insertion at the Kth position of Linked List
Easy

Hints
Company
Given the head of a singly linked list and two integers X and K, insert a node with value X as the kth node of the linked list and return the head of the modified list.


Example 1

Input: linkedList = [1, 2, 3], X = 5, K = 2

Output: [1, 5, 2, 3]

Example 2

Input: linkedList = [], X = 7, K = 1

Output: [7]

Explanation:

Note that the value of the head was changed.

Now your turn!

Input: linkedList = [1, 2], X = 15, K = 3

Output:

Pick your answer


[1, 2, 15]

[1, 2, 3]

[15, 1, 2]

[3, 15]
Constraints

n == number of nodes in the Linked List
0 <= n <= 1000
0 <= ListNode.val <= 100
0 <= X <= 100
1 <= K <= n+1

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
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        if(head == null) {
            if(K == 1) {
                return new ListNode(X);
            }
            else {
                return null;
            }
        }

        if(K == 1) {
            return new ListNode(X, head);
        }

        int count = 0;
        ListNode temp = head;

        while(temp != null) {
            count++;
            if(count == K - 1) {
                ListNode newNode = new ListNode(X);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
}