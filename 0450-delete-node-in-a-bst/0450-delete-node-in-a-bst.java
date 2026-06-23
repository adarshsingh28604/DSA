
class Solution {
    public TreeNode inorderPredecessor(TreeNode root){
        TreeNode temp = root.left;
        while(temp.right!=null) temp = temp.right;
        return temp;
    }

      public TreeNode Parent(TreeNode root,TreeNode pred){
        if(root.left==pred || root.right==pred) return root;
        TreeNode temp = root.left;
        while(temp.right!=pred) temp = temp.right;
        return temp;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
                // case 1 : 0 child nodes
                if(root.left==null && root.right==null) return null;
                
                // case 2 : 1 child nodes
                else if(root.left==null || root.right==null){
                    if(root.left==null) return root.right;
                    else return root.left;
                }

                // case 3: 2 child nodes
                else{
                    TreeNode pred = inorderPredecessor(root);
                    TreeNode predParent = Parent(root,pred);
                    if(root==predParent){
                        pred.right = root.right;
                        return pred;
                    }
                    predParent.right = pred.left;
                    pred.left=root.left ; pred.right = root.right;
                    return pred;
                }
        }
        else if(root.val>key){
            root.left = deleteNode(root.left,key);
        }
        else{
            root.right = deleteNode(root.right,key);
        }
        return root;
    }
}