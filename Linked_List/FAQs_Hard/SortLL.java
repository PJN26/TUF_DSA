//https://leetcode.com/problems/sort-list/description/

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
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }

        temp.next = l1 != null ? l1 : l2;

        return dummyNode.next;
    }

    public ListNode getMid(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode left = head;
        ListNode preMid = getMid(head);
        ListNode right = preMid.next;
        preMid.next = null;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }
}