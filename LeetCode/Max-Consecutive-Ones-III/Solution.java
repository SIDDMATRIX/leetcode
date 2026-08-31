1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0;
4        int zeros = 0;
5        int maxLen = 0;
6
7        for (int right = 0; right < nums.length; right++) {
8
9            if (nums[right] == 0) {
10                zeros++;
11            }
12
13            while (zeros > k) {
14                if (nums[left] == 0) {
15                    zeros--;
16                }
17                left++;
18            }
19
20            maxLen = Math.max(maxLen, right - left + 1);
21        }
22
23        return maxLen;
24    }
25}