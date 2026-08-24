class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) ->
                matrix[a[0]][a[1]] - matrix[b[0]][b[1]]);

        // Add first element of every row
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{i, 0});
        }

        // Remove smallest k-1 elements
        while (k-- > 1) {
            int[] curr = pq.remove();

            int row = curr[0];
            int col = curr[1];

            col++;

            // Add next element from same row
            if (col < n) {
                pq.add(new int[]{row, col});
            }
        }

        int[] ans = pq.peek();

        return matrix[ans[0]][ans[1]];
    }
}