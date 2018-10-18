package problems;

// https://leetcode.com/problems/merge-two-binary-trees/description/
class MergeBinaryTree {
    // TODO: refactor to just add values to t1 tree
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return TreeNodeTraverse(t1, t2, new TreeNode(0));
    }

    public static TreeNode TreeNodeTraverse(TreeNode t1, TreeNode t2, TreeNode t3){
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        t3.val = t1.val + t2.val;
        t3.left = TreeNodeTraverse(t1Left, t2Left, new TreeNode(0));
        t3.right = TreeNodeTraverse(t1Right, t2Right, new TreeNode(0));
        return t3;
    }
}
