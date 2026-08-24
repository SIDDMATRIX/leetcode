1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        for (int []row : matrix){
5            for ( int x : row){
6                pq.add(x);
7            }
8        }
9        for (int i =1;i<k;i ++){
10            pq.poll();
11        }
12        return pq.peek();
13    }
14}