1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3
4        int n = matrix.length;
5
6        PriorityQueue<int[]> pq =
7            new PriorityQueue<>((a, b) ->
8                matrix[a[0]][a[1]] - matrix[b[0]][b[1]]);
9
10        // Add first element of every row
11        for (int i = 0; i < n; i++) {
12            pq.add(new int[]{i, 0});
13        }
14
15        // Remove smallest k-1 elements
16        while (k-- > 1) {
17            int[] curr = pq.remove();
18
19            int row = curr[0];
20            int col = curr[1];
21
22            col++;
23
24            // Add next element from same row
25            if (col < n) {
26                pq.add(new int[]{row, col});
27            }
28        }
29
30        int[] ans = pq.peek();
31
32        return matrix[ans[0]][ans[1]];
33    }
34}