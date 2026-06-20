
class Solution {
     public void helper(TreeNode root, int val) {
        if(root.val<val) {
            if(root.right==null) root.right = new TreeNode(val);
            else helper(root.right,val);
        }
          if(root.val>val) {
            if(root.left==null) root.left = new TreeNode(val);
            else helper(root.left,val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        helper(root,val);
        return root;
    }
}