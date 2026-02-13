// Problem: 283. Move Zeroes
// Time: O(n)
// Space: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
