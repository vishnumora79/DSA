package Trees.From_Scratch;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int val) {
          this.val = val;
          this.left = null;
          this.right = null;
      }
}
public class BinaryTree {
    TreeNode root;

    public void insert(int val) {
        root = insertElement(root,val);
    }
    public TreeNode insertElement(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        if(val < root.val) {
            root.left = insertElement(root.left, val);
        }
        else if(val > root.val) {
            root.right = insertElement(root.right, val);
        }
        return root;
    }

    public void inorderT(TreeNode node) {
        if(node != null) {
            inorderT(node.left);
            System.out.print(node.val + " ");
            inorderT(node.right);
        }
    }

    public int lengthT(TreeNode node) {
        if(node == null)
              return 0;
        return 1 + lengthT(node.left) + lengthT(node.right);
    }


    public int maxLength(TreeNode node) {
        if(node == null)
              return 0;
        int leftLength = maxLength(node.left);
        int rightLength = maxLength(node.right);
        return 1 + Math.max(leftLength, rightLength);
    }
}

class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(7);
        tree.insert(12);
        tree.insert(4);
        tree.insert(15);
        tree.insert(16);

        System.out.print("Inorder traversal : ");
        tree.inorderT(tree.root);

        System.out.println();

        System.out.print("Length of the tree : ");
        System.out.print(tree.lengthT(tree.root));

        System.out.println();

        System.out.print("Maxlength of the tree:");
        System.out.print(tree.maxLength(tree.root));
    }
}

