
class Solution {
      public void inorder(TreeNode root, ArrayList<Integer> ans){
         if(root==null) return;
         inorder(root.left,ans);
         ans.add(root.val);
         inorder(root.right,ans);


     }
       public TreeNode helper(ArrayList<Integer> arr, int low , int high) {
        if(low>high) return null;
         int mid = low + (high-low)/2;
         TreeNode root = new TreeNode(arr.get(mid));
        root.left=helper(arr,low,mid-1);
        root.right=helper(arr,mid+1,high);
        return root;
     }
    public TreeNode balanceBST(TreeNode root) {
         ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
         int n = arr.size();
       return helper(arr,0,n-1);
    }
}