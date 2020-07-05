public class T226 {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root == null) {
                return null;
            }
            TreeNode r = invertTree(root.right);
            TreeNode l = invertTree(root.left);
            root.left = r;
            root.right = l;
            return root;
        }
    }
}
