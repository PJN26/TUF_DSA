//https://leetcode.com/problems/merge-two-sorted-lists/description/

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);

        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode temp = dummyNode;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }
            else {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }

        temp.next = l1 != null ? l1 : l2;

        return dummyNode.next;
    }
}