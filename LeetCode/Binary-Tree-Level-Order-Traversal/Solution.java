1class Solution {
2    public List<List<Integer>> levelOrder(TreeNode root) {
3        List<List<Integer>> ans = new ArrayList<>();
4
5        if (root == null)
6            return ans;
7
8        Queue<TreeNode> q = new LinkedList<>();
9        q.add(root);
10
11        while (!q.isEmpty()) {
12            int n = q.size();
13            List<Integer> level = new ArrayList<>();
14
15            for (int i = 0; i < n; i++) {
16                TreeNode node = q.poll();
17                level.add(node.val);
18
19                if (node.left != null)
20                    q.add(node.left);
21
22                if (node.right != null)
23                    q.add(node.right);
24            }
25
26            ans.add(level);
27        }
28
29        return ans;
30    }
31}