1class Solution {
2    public boolean carPooling(int[][] trips, int capacity) {
3        int[] changes = new int[1001];
4
5        for (int[] trip : trips) {
6            int passengers = trip[0];
7            int from = trip[1];
8            int to = trip[2];
9
10            changes[from] += passengers;
11            changes[to] -= passengers;
12        }
13
14        int current = 0;
15
16        for (int i = 0; i <= 1000; i++) {
17            current += changes[i];
18
19            if (current > capacity) {
20                return false;
21            }
22        }
23
24        return true;
25    }
26}