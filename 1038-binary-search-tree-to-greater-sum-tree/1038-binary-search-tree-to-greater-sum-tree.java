
        
class Solution {
         int sum=0;

       public void inorder(TreeNode root){
         if(root==null) return ;
          inorder(root.right);
         root.val+=sum;
         sum=root.val;
         inorder(root.left);

         
     }
    public TreeNode bstToGst(TreeNode root) {
    
         inorder( root);
         return root;
    }
}
    