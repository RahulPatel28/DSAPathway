package BinarySearchTree;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIVBST {
    public boolean flag = false;

    public void helper(Node root, int k, Set<Integer> set) {
        if(root == null) return;

        if(set.contains(root.val)) {
            flag = true;
            return;
        }

        set.add(k - root.val);
        helper(root.left, k, set);
        helper(root.right, k , set);
    }

    public boolean findTarget(Node root, int k) {
        Set<Integer> set = new HashSet<>();
        helper(root, k , set);
        return flag;
    }
}
