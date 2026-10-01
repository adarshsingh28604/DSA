class Solution {
    int[] parent;
    int[] size;

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]); 
    }
    public boolean union(int u, int v) {
        int pu = find(u);
        int pv = find(v);

        if (pu == pv) {
            return false;
        }
        if (size[pu] < size[pv]) {
            parent[pu] = pv;
            size[pv] += size[pu];
        } else {
            parent[pv] = pu;
            size[pu] += size[pv];
        }

        return true;
    }
    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;

        parent = new int[n + 1];
        size = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        int[] ans = new int[2];

        for (int[] arr : edges) {

            int u = arr[0];
            int v = arr[1];
            if (!union(u, v)) {
                ans[0] = u;
                ans[1] = v;
                break;
            }
        }
        return ans;
    }
}