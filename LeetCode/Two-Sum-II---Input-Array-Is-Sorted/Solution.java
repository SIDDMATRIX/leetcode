1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0;
4        int right = numbers.length - 1;
5        while (left < right) {
6            int sum = numbers[left] + numbers[right];
7            if (sum == target) {
8                return new int[]{left + 1, right + 1};
9            }
10            else if (sum < target) {
11                left++;
12            }
13            else {
14                right--;
15            }
16        }
17
18        return new int[]{-1, -1};
19    }
20}