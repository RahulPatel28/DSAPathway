package BinarySearchTree;

public class RecoverBST {
    Node first = null, second = null, prev = new Node(Integer.MIN_VALUE);

    public void recoverTree(Node root) {
        inorder(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);

        // Detect swapped nodes
        if (prev.val > root.val) {
            if (first == null) first = prev;
            second = root;
        }

        prev = root;

        inorder(root.right);
    }
}
