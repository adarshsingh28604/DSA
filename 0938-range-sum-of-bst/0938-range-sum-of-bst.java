
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int sum = 0;
        if(low <= root.val && root.val <= high) sum+=root.val;

        if(low<=root.val && high<=root.val){
            rangeSumBST(root.left,low,high);
        } 
       else if(low>=root.val && high>=root.val){
             rangeSumBST(root.right,low,high);
        }
             sum += rangeSumBST(root.left, low, high);
             sum += rangeSumBST(root.right, low, high);

         return sum;
    }
}