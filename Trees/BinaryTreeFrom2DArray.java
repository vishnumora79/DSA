package Trees;

import java.util.HashMap;

public class BinaryTreeFrom2DArray {
    public TreeNode createBinary(int[][] arr) {
        HashMap<Integer, TreeNode> node = new HashMap<>();
        TreeNode root = null;

        for(int[] a : arr) {
            int parentVal = a[0];
            int childVal = a[1];
            boolean isLeft = a[2] == 1;

            TreeNode parent = node.getOrDefault(parentVal, new TreeNode(parentVal));
            node.put(parentVal, parent);

            TreeNode child = node.getOrDefault(childVal, new TreeNode(childVal));
            node.put(childVal, child);

            if(root == null)
                root = parent;
        }
        for(int[] a : arr) {
            if(node.containsKey(a[0]) && node.containsKey(a[1])) {
                TreeNode parent = node.get(a[0]);
                TreeNode child = node.get(a[1]);

                if(parent != null && (parent.left == child || parent.right == child)) {
                    if(child == root) {
                        root = null;
                    }
                }
            }
        }
        return root;
    }


    public void inorderT(TreeNode node) {
        if (node != null) {
            inorderT(node.left);
            System.out.print(node.val + " ");
            inorderT(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeFrom2DArray tree = new BinaryTreeFrom2DArray();
        int[][] arr = {
                {1, 2, 1},
                {1, 3, 0},
                {2, 4, 1}
        };
    }

}
