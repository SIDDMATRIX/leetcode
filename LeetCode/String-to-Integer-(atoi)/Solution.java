1class Solution {
2    public int myAtoi(String s) {
3        int i = 0, sign = 1, res = 0, n = s.length();
4
5        while (i < n && s.charAt(i) == ' ') i++;
6
7        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
8            sign = s.charAt(i++) == '-' ? -1 : 1;
9
10        while (i < n) {
11            char c = s.charAt(i);
12            if (c < '0' || c > '9') break;
13
14            int d = c - '0';
15            if (res > (Integer.MAX_VALUE - d) / 10)
16                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
17
18            res = res * 10 + d;
19            i++;
20        }
21
22        return res * sign;
23    }
24}