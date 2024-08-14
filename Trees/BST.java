package Trees;


import sun.reflect.generics.tree.Tree;

public class BST {
    TNode root;

    public BST () {
        root = null;
    }

    public void insert(int val) {
       root = insertRec(root, val);
    }

    private TNode insertRec(TNode root, int val) {
        if(root == null) {
            root = new TNode(val);
            return root;
        }

        if(val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    public void inorder(TNode node) {
        if(node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(4);
        bst.insert(2);
        bst.insert(6);
        bst.insert(1);
        bst.insert(3);
        bst.insert(5);
        bst.insert(7);

        System.out.print("Inorder traversal: ");
        bst.inorder(bst.root);
    }
}
