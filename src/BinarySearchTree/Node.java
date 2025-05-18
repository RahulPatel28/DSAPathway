package BinarySearchTree;

public class Node {
    int val;
    Node left;
    Node() {}
    Node right;
    Node(int val) { this.val = val; }
    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
