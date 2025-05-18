package BinarySearchTree;

public class InsertionIntoBST {
    public Node InsertionIntoBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.val) {
            root.left = InsertionIntoBST(root.left, val);
        } else {
            root.right = InsertionIntoBST(root.right, val);
        }

        return root;
    }
}