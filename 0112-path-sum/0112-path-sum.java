/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public void path(TreeNode root , int s , List<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s+= root.val;
            ans.add(s);
            return;
        }
        path(root.left, s+root.val,ans);
        path(root.right, s+root.val,ans);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
          List<Integer> ans = new ArrayList<>();
          int sum = 0;
        path(root,sum,ans);

        for(int i =0;i<ans.size();i++){
        if(ans.get(i)==targetSum) return true;
      }
        return false;
    }
}