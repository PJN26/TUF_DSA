/*
Traversal in Linked List
Easy

Hints
Company
Given the head of a singly Linked List. Traverse the entire Linked List and return its elements in an array in the order of their appearance.


Example 1

Input: linkedList = [5, 4, 3, 1, 0]

Output: [5, 4, 3, 1, 0]

Explanation:

The nodes in the Linked List are 5 -> 4 -> 3 -> 1 -> 0, with the head pointing to node with value 5.

Example 2

Input: linkedList = [1]

Output: [1]

Explanation:

Only one node (head) present in the list.

Now your turn!

Input: linkedList = [0, 2, 5]

Output:

Pick your answer


[5, 2, 0]

[0]

[0, 2, 5]

[0, 2]
Constraints

0 <= number of nodes in the Linked List <= 105
0 <= ListNode.val <= 104
*/

import java.util.*;

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
    public List<Integer> LLTraversal(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();

        while(temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }
}