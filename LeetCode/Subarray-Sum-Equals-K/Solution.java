1import java.util.HashMap;
2
3class Solution {
4    public int subarraySum(int[] nums, int k) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        
7        int sum = 0;
8        int count = 0;
9
10        // Base case: prefix sum 0 occurs once
11        map.put(0, 1);
12
13        for (int num : nums) {
14            sum += num;
15
16            if (map.containsKey(sum - k)) {
17                count += map.get(sum - k);
18            }
19
20            map.put(sum, map.getOrDefault(sum, 0) + 1);
21        }
22
23        return count;
24    }
25}
26