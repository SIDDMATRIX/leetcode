1class Solution {
2    public int findUnsortedSubarray(int[] nums) {
3        int[] sorted = nums.clone();
4        Arrays.sort(sorted);
5
6        int l = 0, r = nums.length - 1;
7
8        while (l < nums.length && nums[l] == sorted[l]) l++;
9        while (r >= 0 && nums[r] == sorted[r]) r--;
10
11        return l < r ? r - l + 1 : 0;
12    }
13}