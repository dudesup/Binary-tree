package inorder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InorderTraversalIteratingWithStackTest {
    @Test
    public void inorderTraversalTest() {
        //GIVEN
        InorderTraversalIteratingWithStack recursion = new InorderTraversalIteratingWithStack();
        TreeNode right = new TreeNode(2, new TreeNode(3), null);
        TreeNode root = new TreeNode(1, null, right);

        //WHEN
        var actual = recursion.iteratingApproach(root);

        //THEN
        List<Integer> expected = List.of(1, 3, 2);
        assertEquals(expected, actual);
    }
}