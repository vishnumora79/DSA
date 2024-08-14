package Trees.From_Scratch;

//public class Array_to_BinaryTree {
//    TreeNode root;
//    public static TreeNode BuildTree(int[] arr) {
//        return buildTreeHelper(arr, 0);
//    }
//
//    private static TreeNode buildTreeHelper(int[] arr, int i) {
//        if(i >= arr.length)
//            return null;
//        TreeNode node = new TreeNode(arr[i]);
//        node.left = buildTreeHelper(arr, 2 * i + 1);
//        node.right = buildTreeHelper(arr, 2 * i + 2);
//        return node;
//    }
//
//    private static void inorderT(TreeNode node) {
//        if(node != null) {
//            inorderT(node.left);
//            System.out.print(node.val + " ");
//            inorderT(node.right);
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {10, 7, 12, 4 ,15, 16};
//        int n = arr.length;
//        TreeNode root = BuildTree(arr);
//        inorderT(root);
//    }
//}


import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left, right;

    Node(int x) {
        val = x;
        left = null;
        right = null;
    }
}
public class Array_to_BinaryTree {
//    Using Formula
//    public static Node tree(int[] arr) {
//        return buildTree(arr, 0);
//    }
//
//    public static Node buildTree(int[] arr, int i) {
//        if(i >= arr.length)
//             return null;
//
//        Node node = new Node(arr[i]);
//        node.left = buildTree(arr, 2 * i + 1);
//        node.right = buildTree(arr, 2 * i + 2);
//
//        return node;
//    }

    public static Node tree(int[] arr) {
        Node node = new Node(arr[0]);
        int i = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty() && i < arr.length) {
            Node temp = queue.poll();
            if(i < arr.length) {
                temp.left = new Node(arr[i]);
                queue.add(temp.left);
                i++;
            }
            if(i < arr.length) {
                temp.right = new Node(arr[i]);
                queue.add(temp.right);
                i++;
            }
        }
        return node;
    }

    public static void inorder(Node root) {
        if(root == null)
              return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 12, 4 ,15, 16};
        int n = arr.length;

        Node root = tree(arr);
        inorder(root);



    }
}

