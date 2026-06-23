
class Solution {
     public void preorder(TreeNode root,List<TreeNode> arr) {
        if(root==null) return;
        arr.add(root);
        preorder(root.left,arr);
        preorder(root.right,arr);
     }
    public void flatten(TreeNode root) {
        List<TreeNode> pre = new ArrayList<>();
        preorder(root,pre);
        int n = pre.size();
        for(int i = 0; i<n;i++){
         if(i!=n-1)   pre.get(i).right= pre.get(i+1);
            pre.get(i).left=null;
        }
    }
}