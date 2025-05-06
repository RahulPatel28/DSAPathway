package BinaryTrees;

import java.util.HashMap;

public class BinaryTreeFromInorderAndPostorder {
    int post;  // global pointer

    private TreeNode helper(int left, int right, int[] inorder, int[] postorder, HashMap<Integer, Integer> map) {
        if (left > right) return null; // no nodes

        int rootVal = postorder[post--];  // get current root
        TreeNode root = new TreeNode(rootVal);

        int inIdx = map.get(rootVal);  // find inorder index

        // IMPORTANT: build right subtree first
        root.right = helper(inIdx + 1, right, inorder, postorder, map);
        root.left = helper(left, inIdx - 1, inorder, postorder, map);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post = postorder.length - 1;  // start from last element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, inorder.length - 1, inorder, postorder, map);
    }
}
