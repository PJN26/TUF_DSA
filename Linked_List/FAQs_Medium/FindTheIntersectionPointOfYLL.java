//https://leetcode.com/problems/intersection-of-two-linked-lists/description/

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode t1 = headA;
        ListNode t2 = headB;

        while(t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;

            if(t1 == t2) {
                return t1;
            }

            if(t1 == null) t1 = headB;
            if(t2 == null) t2 = headA;
        }
        return t1;
    }
}
