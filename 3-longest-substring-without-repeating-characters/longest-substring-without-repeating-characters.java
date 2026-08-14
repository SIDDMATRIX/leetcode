class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] fs = new int[128];

        int i = 0;
        int j = 0;
        int dup = 0;
        int maxLength = 0;

        while (j < s.length()) {

            fs[s.charAt(j)]++;

            if (fs[s.charAt(j)] == 2) {
                dup++;
            }

            while (dup > 0) {

                if (fs[s.charAt(i)] == 2) {
                    dup--;
                }

                fs[s.charAt(i)]--;
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);

            j++;
        }

        return maxLength;
    }
}