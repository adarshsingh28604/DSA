
class Solution {
    public void invert(TreeNode root ){
            if(root==null) return;
        TreeNode temp = new TreeNode();
            temp=root.left;
           root.left = root.right;
           root.right = temp;
           invert(root.left);
           invert(root.right);
           
        }
        public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p!=null && q==null) return false;
        if(p==null && q!=null) return false;
        if(p.val!=q.val) return false;
      if(  isSameTree(p.left,q.left)==false) return false;
      if(  isSameTree(p.right,q.right)==false) return false;
      return true;
    }
    public boolean isSymmetric(TreeNode root) {
        invert(root.left);
       return isSameTree(root.left,root.right);
    }
}