package leetcode;

/*
Given two binary trees original and cloned and given a reference to a node target in the original tree.

The cloned tree is a copy of the original tree.

Return a reference to the same node in the cloned tree.

Note that you are not allowed to change any of the two trees or the target node and the answer must be a
reference to a node in the cloned tree.
**/

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static class FindNodeOfBinaryTree {
        TreeNode temp;

        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            solve(original, target);
            solve(cloned, temp);
            return temp;
        }

        public void solve(TreeNode root, TreeNode target) {
            if (root == null) return;

            if (root.val == target.val) {
                temp = root;
                return;
            }

            solve(root.left, target);
            solve(root.right, target);
        }
    }
}
