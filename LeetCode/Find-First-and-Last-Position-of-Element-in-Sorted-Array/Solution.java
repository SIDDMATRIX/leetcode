1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3
4        int first = -1;
5        int last = -1;
6
7        int left = 0, right = nums.length - 1;
8
9        
10        while (left <= right) {
11            int mid = left + (right - left) / 2;
12
13            if (nums[mid] == target) {
14                first = mid;
15                right = mid - 1;
16            }
17            else if (nums[mid] < target) {
18                left = mid + 1;
19            }
20            else {
21                right = mid - 1;
22            }
23        }
24
25        left = 0;
26        right = nums.length - 1;
27
28
29        while (left <= right) {
30            int mid = left + (right - left) / 2;
31
32            if (nums[mid] == target) {
33                last = mid;
34                left = mid + 1;
35            }
36            else if (nums[mid] < target) {
37                left = mid + 1;
38            }
39            else {
40                right = mid - 1;
41            }
42        }
43
44        return new int[]{first, last};
45    }
46}