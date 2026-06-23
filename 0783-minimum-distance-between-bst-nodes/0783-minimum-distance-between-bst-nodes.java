
class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);

    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i<ans.size()-1; i++){
            int minus = ans.get(i+1) - ans.get(i);
            diff = Math.min(diff,minus);
        }
        return diff;
    }
}