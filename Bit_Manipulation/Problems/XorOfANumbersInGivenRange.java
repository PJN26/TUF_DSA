/*
XOR of numbers in a given range
Hints
Company
Given two integers L and R. Find the XOR of the elements in the range [L , R].


Example 1

Input : L = 3 , R = 5

Output : 2

Explanation : answer = (3 ^ 4 ^ 5) = 2.

Example 2

Input : L = 1, R = 3

Output : 0

Explanation : answer = (1 ^ 2 ^ 3) = 0.

Now your turn!

Input : L = 4, R = 10

Output:

Pick your answer


10

4

11

8
Constraints

1 <= L <= R <= 109
*/

class Solution {
    public int findRangeXOR(int l, int r) {
        l = l - 1;
        int lxor = 0;
        int rxor = r;

        if(l % 4 == 1) {
            lxor = 1;
        }
        else if(l % 4 == 2) {
            lxor = l + 1;
        }
        else if(l % 4 == 3) {
            lxor = 0;
        }
        else {
            lxor = l;
        }

        if(r % 4 == 1) {
            rxor = 1;
        }
        else if(r % 4 == 2) {
            rxor = r + 1;
        }
        else if(r % 4 == 3) {
            rxor = 0;
        }
        else {
            rxor = r;
        }

        return lxor ^ rxor;
    }
}