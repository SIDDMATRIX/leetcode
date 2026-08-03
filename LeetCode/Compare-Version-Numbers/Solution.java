1class Solution {
2    public int compareVersion(String version1, String version2) {
3        int i = 0, j = 0;
4        int n = version1.length(), m = version2.length();
5
6        while (i < n || j < m) {
7            int num1 = 0, num2 = 0;
8
9            while (i < n && version1.charAt(i) != '.') {
10                num1 = num1 * 10 + (version1.charAt(i) - '0');
11                i++;
12            }
13
14            while (j < m && version2.charAt(j) != '.') {
15                num2 = num2 * 10 + (version2.charAt(j) - '0');
16                j++;
17            }
18
19            if (num1 > num2) return 1;
20            if (num1 < num2) return -1;
21
22            i++;
23            j++;
24        }
25
26        return 0;
27    }
28}