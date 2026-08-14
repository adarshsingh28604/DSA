
class Solution {
    public int levels(TreeNode root , HashMap<TreeNode , Integer> dp){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        dp.put(root , 1 + Math.max(levels(root.left,dp),levels(root.right,dp)));
        return dp.get(root);
    }
        public int diameter(TreeNode root ,HashMap<TreeNode , Integer> dp  ) {
        if(root==null) return 0;
        int myDia = levels(root.left,dp)+levels(root.right,dp);
        int leftDia = diameter(root.left,dp);
        int rightDia = diameter(root.right,dp);
        return Math.max(myDia,Math.max(leftDia,rightDia));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        HashMap<TreeNode , Integer> dp = new HashMap<>();
        return diameter(root , dp);
    }
}