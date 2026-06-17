
class Solution {
    public void nthlevel(TreeNode root, int level, int lvl, List<Integer> arr){
        if(root==null) return;
        if(level>lvl) return;
        if(level==lvl) arr.add(root.val);
        nthlevel(root.left,level+1,lvl,arr);
        nthlevel(root.right,level+1,lvl,arr);
    }
    public int levels(TreeNode root){
    if(root == null) return 0;

    return 1 + Math.max(levels(root.left),
                        levels(root.right));
}
    public List<List<Integer>> levelOrder(TreeNode root) {
        int level = levels(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<level;i++){
          List<Integer> arr = new ArrayList<>();
          nthlevel(root,0,i,arr);
          ans.add(arr);
        }
        return ans;
    }
}