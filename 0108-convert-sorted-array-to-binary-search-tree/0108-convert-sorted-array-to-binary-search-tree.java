
class Solution {
     public TreeNode helper(int[] arr, int low , int high) {
        if(low>high) return null;
         int mid = low + (high-low)/2;
         TreeNode root = new TreeNode(arr[mid]);
        root.left=helper(arr,low,mid-1);
        root.right=helper(arr,mid+1,high);
        return root;
     }
    public TreeNode sortedArrayToBST(int[] arr) {
        int n = arr.length;
       return helper(arr,0,n-1);
    }
}