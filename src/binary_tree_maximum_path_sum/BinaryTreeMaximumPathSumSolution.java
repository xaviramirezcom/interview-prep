package binary_tree_maximum_path_sum;

import utils.TreeNode;

public class BinaryTreeMaximumPathSumSolution {

    int maxPathSum = Integer.MIN_VALUE;

    public int maxGain(TreeNode node) {
        if(node==null) return 0;

        int leftGain = Math.max(maxGain(node.left),0);
        int rightGain = Math.max(maxGain(node.right), 0);

        int currentPathPrice = node.val + leftGain + rightGain;
        maxPathSum = Math.max(maxPathSum, currentPathPrice);

        return node.val + Math.max(leftGain, rightGain);
    }

    public int solve(TreeNode root) {
        maxGain(root);
        return maxPathSum;
    }

}
