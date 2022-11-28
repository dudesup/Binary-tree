package inorder;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> recursiveApproach(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);

        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root != null) {
            helper(root.left, result);
            result.add(root.val);
            helper(root.right, result);
        }
    }
}
