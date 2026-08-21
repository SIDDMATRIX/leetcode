1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3
4        List<List<Integer>> graph = new ArrayList<>();
5
6        for (int i = 0; i < numCourses; i++)
7            graph.add(new ArrayList<>());
8
9        int[] indegree = new int[numCourses];
10
11        for (int[] p : prerequisites) {
12            int course = p[0];
13            int pre = p[1];
14
15            graph.get(pre).add(course);
16            indegree[course]++;
17        }
18
19        Queue<Integer> q = new LinkedList<>();
20
21        for (int i = 0; i < numCourses; i++) {
22            if (indegree[i] == 0)
23                q.add(i);
24        }
25
26        int[] ans = new int[numCourses];
27        int index = 0;
28
29        while (!q.isEmpty()) {
30            int course = q.poll();
31            ans[index++] = course;
32
33            for (int next : graph.get(course)) {
34                indegree[next]--;
35
36                if (indegree[next] == 0)
37                    q.add(next);
38            }
39        }
40
41        if (index != numCourses)
42            return new int[0];
43
44        return ans;
45    }
46}