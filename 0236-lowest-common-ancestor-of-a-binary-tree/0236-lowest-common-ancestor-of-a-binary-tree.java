class Solution {
    public boolean contains(TreeNode root, TreeNode node) {
        if (root == null) return false;
        if (root == node) return true;
        return contains(root.left, node) || contains(root.right, node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p == root || q == root) return root;

        boolean leftp = contains(root.left, p);
        boolean leftq = contains(root.left, q); // ← yeh line add kar, rightq hata

        if (leftp && leftq)    return lowestCommonAncestor(root.left, p, q);
        if (!leftp && !leftq)  return lowestCommonAncestor(root.right, p, q);
        return root; // opposite sides → root hi LCA hai
    }
}