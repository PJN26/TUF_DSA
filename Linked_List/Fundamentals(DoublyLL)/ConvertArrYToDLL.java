/*
Convert Array to Doubly Linked List
Easy

Hints
Company
Given an array arr, convert it into a doubly linked list and return the head of the list.


Example 1

Input: arr = [1, 2, 3, 4]

Output: [1, 2, 3, 4]

Example 2

Input: arr = [7, 7]

Output: [7, 7]

Now your turn!

Input: nums = [3]

Output:

Correct

head -> 3

head -> 3 -> 3

head -> 0 <-> 3

head -> 1 <-> 3
Constraints

n == nums.length
0 <= n <= 100
0 <= nums[i] <= 100
*/

/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
        if(arr.size() == 0) return null;

        ListNode head = new ListNode(arr.get(0));
        ListNode lastNode = head;

        for(int i = 1; i < arr.size(); i++) {
            ListNode node = new ListNode(arr.get(i), lastNode, null);
            lastNode.next = node;
            lastNode = node;
        }
        return head;
    }
}