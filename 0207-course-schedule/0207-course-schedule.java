class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            adj.get(edge[1]).add(edge[0]);
        }

        int[] vis = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {

            if (vis[i] == 0) {
                if (dfs(i, adj, vis)) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int node, List<List<Integer>> adj, int[] vis) {
        if (vis[node] == 1) {
            return true; 
        }
        if (vis[node] == 2) {
            return false;
        }
        vis[node] = 1;
        for (int next : adj.get(node)) {
            if (dfs(next, adj, vis)) {
                return true;
            }
        }
        vis[node] = 2;

        return false;
    }
}