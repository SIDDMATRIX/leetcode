1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
26        int count = 0;
27
28        while (!q.isEmpty()) {
29            int course = q.poll();
30            count++;
31
32            for (int next : graph.get(course)) {
33                indegree[next]--;
34
35                if (indegree[next] == 0)
36                    q.add(next);
37            }
38        }
39
40        return count == numCourses;
41    }
42}