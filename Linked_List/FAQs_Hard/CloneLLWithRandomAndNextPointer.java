//https://leetcode.com/problems/copy-list-with-random-pointer/description/

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode random;

    ListNode() {
        val = 0;
        next = null;
        random = null;
    }

    ListNode(int val) {
        this.val = val;
        next = null;
        random = null;
    }

    ListNode(int val, ListNode next, ListNode random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
 */

class Solution {
    public void copyInBetween(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            ListNode newNode = new ListNode(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }
    }

    public void connectRandomPointers(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            if(temp.random != null) {
                temp.next.random = temp.random.next;
            } 
            temp = temp.next.next;
        }
    }

    public ListNode getDeepCopy(ListNode head) {
        ListNode temp = head;
        ListNode dummyNode = new ListNode(-1);
        ListNode tempn = dummyNode;

        while(temp != null) {
            tempn.next = temp.next;
            tempn = tempn.next;
            temp.next = temp.next.next;
            tempn.next = null;
            temp = temp.next;
        }

        return dummyNode.next;
    }

    public ListNode copyRandomList(ListNode head) {
        if(head == null) return null;
        copyInBetween(head);
        connectRandomPointers(head);
        return getDeepCopy(head);
    }
}
