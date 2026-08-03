1class Solution {
2    public int myAtoi(String s) {
3        int i = 0, n = s.length();
4        int sign = 1;
5        int result = 0;
6
7        while (i < n && s.charAt(i) == ' ') {
8            i++;
9        }
10
11        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
12            sign = (s.charAt(i) == '-') ? -1 : 1;
13            i++;
14        }
15
16        while (i < n && Character.isDigit(s.charAt(i))) {
17            int digit = s.charAt(i) - '0';
18
19            if (result > (Integer.MAX_VALUE - digit) / 10) {
20                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
21            }
22
23            result = result * 10 + digit;
24            i++;
25        }
26
27       
28        return result * sign;
29    }
30}
31