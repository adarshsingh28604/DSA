
class Solution {
   
    public class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node , int level){
            this.node = node;
            this.level = level;
        }
    }
    public void BFS(TreeNode root, List<List<Integer>> ans ){
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;

            ans.get(lvl).add(temp.val);

            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        } 
    }
     public int levels(TreeNode root){
    if(root == null) return 0;

    return 1 + Math.max(levels(root.left),
                        levels(root.right));
}
    public List<Integer> rightSideView(TreeNode root) {
         int lvl = levels(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<lvl;i++){
          List<Integer> arr = new ArrayList<>();
          ans.add(arr);
        }
        BFS(root,ans);
        List<Integer> finalAns = new ArrayList<>();

            for(int i = 0; i < ans.size(); i++){
             List<Integer> list = ans.get(i);

            if(!list.isEmpty()){
             finalAns.add(list.get(list.size() - 1));
      }
   }
        return finalAns;
    }
}