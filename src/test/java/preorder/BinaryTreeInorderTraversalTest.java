package preorder;

import org.junit.jupiter.api.Test;
import preorder.BinaryTreePreorderTraversal;
import preorder.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeInorderTraversalTest {

    @Test
    void preorderTraversalTest() {
        //GIVEN
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();
        TreeNode right = new TreeNode(2, new TreeNode(3), null);
        TreeNode root = new TreeNode(1, null, right);

        //WHEN
        var actual = binaryTreePreorderTraversal.preorderTraversal(root);

        //THEN
        List<Integer> expected = List.of(1, 2, 3);
        assertEquals(expected, actual);
    }

}