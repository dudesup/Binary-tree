package inorder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeInorderTraversalTest {
    @Test
    public void inorderTraversalTest() {
        //GIVEN
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        TreeNode right = new TreeNode(2, new TreeNode(3), null);
        TreeNode root = new TreeNode(1, null, right);

        //WHEN
        var actual = binaryTreeInorderTraversal.recursiveApproach(root);

        //THEN
        List<Integer> expected = List.of(1, 3, 2);
        assertEquals(expected, actual);
    }

}