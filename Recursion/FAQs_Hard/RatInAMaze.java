/*
Rat in a Maze
Hard

Hints
Company
Given a grid of dimensions n x n. A rat is placed at coordinates (0, 0) and wants to reach at coordinates (n-1, n-1).



Find all possible paths that rat can take to travel from (0, 0) to (n-1, n-1). The directions in which rat can move are 'U' (up) , 'D' (down) , 'L' (left) , 'R' (right).



The value 0 in grid denotes that the cell is blocked and rat cannot use that cell for travelling, whereas value 1 represents that rat can travel through the cell. If the cell (0, 0) has 0 value, then mouse cannot move to any other cell.



Note :

In a path no cell can be visited more than once.
If there is no possible path then return empty vector.

Example 1

Input : n = 4 , grid = [ [1, 0, 0, 0] , [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1] ]

Output : [ "DDRDRR" , "DRDDRR" ]

Explanation : The rat has two different path to reach (3, 3).

The first path is (0, 0) => (1, 0) => (2, 0) => (2, 1) => (3, 1) => (3, 2) => (3, 3).

The second path is (0,0) => (1,0) => (1,1) => (2,1) => (3,1) => (3,2) => (3,3).

Example 2

Input : n = 2 , grid = [ [1, 0] , [1, 0] ]

Output : -1

Explanation : There is no path that rat can choose to travel from (0,0) to (1,1).

Example 3

Input : n = 3 , grid = [ [1, 0, 0] , [1, 1, 0], [0, 1, 1] ]

Output:

[ 'DRDR']
Constraints

2 <= n <= 5
0 <= grid[i][j] <= 1
*/

import java.util.*;

class Solution {
    public void getPath(int row, int col, int[][] grid, StringBuilder sb, List<String> path) {
        if(grid[row][col] == 0) return;
        if(row == grid.length - 1 && col == grid[0].length - 1) {
            path.add(sb.toString());
            return;
        }

        grid[row][col] = 0;

        if(row > 0) {
            sb.append("U");
            getPath(row - 1, col, grid, sb, path);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(row < grid.length - 1) {
            sb.append("D");
            getPath(row + 1, col, grid, sb, path);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(col > 0) {
            sb.append("L");
            getPath(row, col - 1, grid, sb, path);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(col < grid[0].length - 1 && grid[row][col + 1] == 1) {
            sb.append("R");
            getPath(row, col + 1, grid, sb, path);
            sb.deleteCharAt(sb.length() - 1);
        }

        grid[row][col] = 1;
    }
    public List<String> findPath(int[][] grid) {
        List<String> path = new ArrayList<>();
        if(grid[0][0] == 0) return path;
        getPath(0, 0, grid, new StringBuilder(""), path);
        return path;
    }
}