//https://leetcode.com/problems/add-two-numbers/description/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);

        ListNode temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            if(l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;

            ListNode newNode = new ListNode(sum % 10);
            temp.next = newNode;
            temp = temp.next;
        }
        return dummy.next;
    }
}