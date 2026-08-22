1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3     
4      int freq []= new int[k];
5      freq[0]= 1 ;
6      int sum =0;
7      int count = 0;
8      for (int num :nums){
9        sum += num;
10        int rem = sum % k;
11        if (rem < 0)
12        rem += k ;
13        count +=  freq[rem];
14        freq [rem]++;
15      }
16      return count ;
17    }
18
19}