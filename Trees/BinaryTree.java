package Trees;


import java.util.LinkedList;
import java.util.Queue;


class TNode {
    int val;
    TNode left;
    TNode right;

    TNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TNode root;

    public BinaryTree () {
        root = null;
    }

    public void insert(int val) {
        if(root == null) {
            root = new TNode(val);
            return;
        }

        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TNode temp = queue.poll();
            if(temp.left == null) {
                temp.left = new TNode(val);
                break;
            }
            else {
                queue.add(temp.left);
            }

            if(temp.right == null) {
                temp.right = new TNode(val);
                break;
            }
            else {
                queue.add(temp.right);
            }
        }
    }

    public void inorder(TNode node) {
        if(node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(1);
        bt.insert(3);
        bt.insert(10);
        bt.insert(15);

        bt.inorder(bt.root);
    }
}



