
class Solution {
       public void inorder(TreeNode root,  ArrayList<TreeNode> ans){
         if(root==null) return;
         inorder(root.left,ans);
         ans.add(root);
         inorder(root.right,ans);


     }
    public TreeNode convertBST(TreeNode root) {
         ArrayList<TreeNode> ans = new ArrayList<>();
         inorder( root, ans);
         int n = ans.size();
         for(int i = n-2;i>=0;i--){
            ans.get(i).val += ans.get(i+1).val;
         }
         return root;
    }
}