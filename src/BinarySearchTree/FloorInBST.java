package BinarySearchTree;

public class FloorInBST {
    public static int floor(Node root, int x) {
        // Code here
        int ans = -1;

        while (root != null) {
            if (root.val == x) return root.val;

            if (root.val < x) {
                ans = root.val;
                root = root.right; // try for closer floor
            } else {
                root = root.left;
            }
        }

        return ans;
    }
}

