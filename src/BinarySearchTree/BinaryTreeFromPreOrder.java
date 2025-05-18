package BinarySearchTree;

public class BinaryTreeFromPreOrder {
    int index = 0;

    private Node helper(int[] pre, int bound) {
        if(index == pre.length || pre[index] > bound) {
            return null;
        }
        int val = pre[index++];
        Node root = new Node(val);

        root.left = helper(pre, val);
        root.right = helper(pre, bound);

        return root;
    }

    public Node bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE);
    }
}
