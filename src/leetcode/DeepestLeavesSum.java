package leetcode;

import com.sun.source.tree.Tree;

public class DeepestLeavesSum {

    //INCOMPLETO -
    static int sum = 0;
    public static int deepestLeavesSum(TreeNode root) {
        solve(root, root.left);
        return sum;
    }

    public static void solve(TreeNode root, TreeNode direcao){
        while (root != null){
            if (direcao == null) {
                sum += root.val;
                break;
            }else{
                solve(direcao, direcao.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode td = new TreeNode(1);
        td.left.val = 3;
        td.right.val = 5;

        int i = deepestLeavesSum(td);
        System.out.println(i);
    }
}


