import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        boolean[] check = new boolean[arr.length];
        permutations(arr, check, a, ans);
        return ans;
    }
    private void permutations(
            int[] arr,
            boolean[] check,
            List<Integer> a,
            List<List<Integer>> ans) {
        int n = arr.length;
        // Base case
        if (a.size() == n) {
            List<Integer> copy = new ArrayList<>(a);
            ans.add(copy);
            return;
        }
        // Try every element
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                // Choose
                a.add(arr[i]);
                check[i] = true;
                // Explore
                permutations(arr, check, a, ans);
                // Backtrack
                a.remove(a.size() - 1);
                check[i] = false;
            }
        }
    }
}