class Solution {

    public void helper(TreeNode root, int targetSum, List<Integer> arr, List<List<Integer>> ans) {
        if(root == null) return;
        List<Integer> newArr = new ArrayList<>(arr);
        newArr.add(root.val);
        if(root.left == null && root.right == null) {
            if(targetSum == root.val) {
                ans.add(newArr);
            }
            return;
        }
        helper(root.left, targetSum - root.val, newArr, ans);
        helper(root.right, targetSum - root.val, newArr, ans);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, targetSum, new ArrayList<>(), ans);
        return ans;
    }
}