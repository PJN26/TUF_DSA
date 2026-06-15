/*
Sort a Linked List of 0's 1's and 2's
Medium

Hints
Company
Given the head of a singly linked list consisting of only 0, 1 or 2.



Sort the given linked list and return the head of the modified list.



Do it in-place by changing the links between the nodes without creating new nodes.


Example 1

Input: linkedList = [1, 0, 2, 0 , 1]

Output: [0, 0, 1, 1, 2]

Explanation: The values after sorting are [0, 0, 1, 1, 2].

Example 2

Input: linkedList = [1, 1, 1, 0]

Output: [0, 1, 1, 1]

Explanation: The values after sorting are [0, 1, 1, 1].

Now your turn!

Input: linkedList = [2, 2, 1, 2]

Output:

Pick your answer


[2, 2, 2, 1]

[1, 2, 2, 2]

[1, 2, 2]

[2, 2, 1]
Constraints

0 <= number of nodes in the Linked List <= 105
0 <= ListNode.val <= 2
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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);

        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;

        ListNode temp = head;

        while(temp != null) {
            if(temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if(temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }
}