
class Solution {
        public int levels(TreeNode root,boolean[] arr){
    if(root == null) return 0;
       int leftlevels = levels(root.left, arr);
       int rightlevels = levels(root.right, arr);
        int diff = Math.abs(leftlevels-rightlevels);

       if(diff>1) arr[0]=false; 

    return 1 + Math.max(leftlevels,
                        rightlevels);
}
    public boolean isBalanced(TreeNode root) {
       boolean[] arr = {true};
       levels(root,arr);
        return arr[0];
    }
}