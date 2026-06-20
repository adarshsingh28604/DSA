
class Solution {
        public TreeNode search(TreeNode root , int val ){
           if(root==null) return null;
            if(root.val==val) return root;


        if(val < root.val) return search(root.left, val);
        else return search(root.right, val);
    }

    public TreeNode searchBST(TreeNode root, int val) {
            if(root==null) return null;
          return search(root,val);
    }
}