package Trees;
import java.util.*;
import sun.reflect.generics.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class InorderTraversal {
    public static void main(String[] args) {
           ArrayList<Integer> ans = new ArrayList<>();
           TreeNode root = new TreeNode(1);
           root.left  = new TreeNode(2);
           root.right = new TreeNode(3);
//           root.left == new TreeNode(4);
           inorder(root,ans);
           for(int data : ans) {
               System.out.print(data  + "");
           }
    }

    public static void inorder(TreeNode node,List<Integer> ans) {
            if(node == null)
                 return;

            inorder(node.left,ans);
            ans.add(node.val);
            inorder(node.right,ans);
    }
}
