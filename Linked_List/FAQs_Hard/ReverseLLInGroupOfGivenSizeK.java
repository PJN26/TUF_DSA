//https://leetcode.com/problems/reverse-nodes-in-k-group/description/

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
    public ListNode getKthNode(ListNode temp, int k) {
        k -= 1;

        while(temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode reverseLL(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode prevLast = null;

        while(temp != null) {
            ListNode kthNode = getKthNode(temp, k);

            if(kthNode == null) {
                if(prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            reverseLL(temp);

            if(temp == head) {
                head = kthNode;
            } else {
                prevLast.next = kthNode;
            }

            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
}