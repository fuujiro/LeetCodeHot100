import java.util.HashMap;

public class T437 {

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
        public int pathSum(TreeNode root, int sum) {
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,1);
            return helper(root,map,sum,0);
        }
        private int helper(TreeNode root, HashMap<Integer, Integer> map, int sum, int pathSum) {
            int res = 0;
            if (root==null)
                return 0;
            pathSum += root.val;
            res += map.getOrDefault(pathSum - sum, 0);
            map.put(pathSum,map.getOrDefault(pathSum,0)+1);
            res = helper(root.left,map,sum,pathSum)+helper(root.right,map,sum,pathSum)+res;
            map.put(pathSum,map.get(pathSum)-1);
            return res;
        }
    }
}
