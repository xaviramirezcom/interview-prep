package binary_tree_maximum_path_sum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utils.TreeNode;

public class BinaryTreeMaximumPathSumSolutionTest {
    @Test
    public void when_1_2_3_Then_6() {

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);

        BinaryTreeMaximumPathSumSolution solver = new BinaryTreeMaximumPathSumSolution();

        assertEquals(6, solver.solve(root));
    }

    @Test
    public void when_Negative10_9_20_Null_Null_15_7_Then_42() {

        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20,new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(-10, left, right);

        BinaryTreeMaximumPathSumSolution solver = new BinaryTreeMaximumPathSumSolution();

        assertEquals(42, solver.solve(root));

    }
}
