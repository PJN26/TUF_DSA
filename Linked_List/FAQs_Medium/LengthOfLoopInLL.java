/*
Length of loop in LL
Hints
Company
Given the head of a singly linked list, find the length of the loop in the linked list if it exists. Return the length of the loop if it exists; otherwise, return 0.



A loop exists in a linked list if some node in the list can be reached again by continuously following the next pointer. Internally, pos is used to denote the index (0-based) of the node from where the loop starts.



Note that pos is not passed as a parameter.


Example 1



Input: head -> 1 -> 2 -> 3 -> 4 -> 5, pos = 1

Output: 4

Explanation: 2 -> 3 -> 4 -> 5 - >2, length of loop = 4.

Example 2



Input: head -> 1 -> 3 -> 7 -> 4, pos = -1

Output: 0

Explanation: No loop is present in the linked list.

Now your turn!





Input: head -> 6 -> 3 -> 7, pos = 0

Output:

Pick your answer


6

2

0

3
Constraints

0 <= number of nodes in the cycle <= 105
0 <= ListNode.val <= 104
pos is -1 or a valid index in the linked list

*/
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
     public int findLengthOfLoop(ListNode head) {
        if(head == null || head.next == null) {
            return 0;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                slow = head;
                break;
            }
        }

        if(fast == null || fast.next == null) return 0;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        int count = 1;

        slow = slow.next;

        while(slow != fast) {
            count++;
            slow = slow.next;
        }

        return count;
     }
 }