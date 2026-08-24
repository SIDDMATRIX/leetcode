1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        map.put(0, -1);
7
8        int sum = 0;
9
10        for (int i = 0; i < nums.length; i++) {
11
12            sum += nums[i];
13
14            int rem = sum % k;
15
16            if (map.containsKey(rem)) {
17
18                if (i - map.get(rem) >= 2)
19                    return true;
20
21            } else {
22                map.put(rem, i);
23            }
24        }
25
26        return false;
27    }
28}