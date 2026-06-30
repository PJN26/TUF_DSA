/*
Delete all occurrences of a key in DLL
Hints
Company
Given the head of a doubly linked list and an integer target. Delete all nodes in the linked list with the value target and return the head of the modified linked list.


Example 1

Input: head -> 1 <-> 2 <-> 3 <-> 1 <-> 4, target = 1

Output: head -> 2 <-> 3 <-> 4

Explanation: All nodes with the value 1 were removed.

Example 2

Input: head -> 2 <-> 3 <-> -1 <-> 4 <-> 2, target = 2

Output: head -> 3 <-> -1 <-> 4

Explanation: All nodes with the value 2 were removed.

Note that the value of head is changed.

Now your turn!

Input: head -> 7 <-> 7 <-> 7 <-> 7, target = 7

Output:

Pick your answer


head -> 7 <-> 7 <-> 7

head <-> 7

head -> 7

head
Constraints

0 <= number of nodes in the linked list <= 105
-104 <= ListNode.val <= 104
-104 <= target <= 104
*/

/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        if(head == null) return null;
        ListNode dummyNode = new ListNode(-1, head, null);
        head.prev = dummyNode;

        ListNode temp = dummyNode;

        while(temp != null && temp.next != null) {
            if(temp.next.val == target) {
                ListNode targetNode = temp.next;
                if(targetNode.next != null) {
                    targetNode.next.prev = temp;
                }
                temp.next = targetNode.next;
                targetNode.next = null;
                targetNode.prev = null;
                continue;
            }
            temp = temp.next;
        }
        head = dummyNode.next;
        if(head != null) head.prev = null;
        dummyNode.next = null;
        return head;
    }
}
