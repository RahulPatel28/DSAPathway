package BinarySearchTree;

public class CeilInBST {
    public static int ceil(Node root, int x) {
        int ans = -1;

        while (root != null) {
            if (root.val == x) {
                return root.val;
            }

            if (root.val > x) {
                ans = root.val;     // possible ceil
                root = root.left;    // try to find smaller valid value
            } else {
                root = root.right;
            }
        }

        return ans;
    }

}
