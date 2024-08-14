package LinkedList_Learning;
//
//
//import java.util.Scanner;
//
//class LinkedL {
//    Node head;
//    LinkedL() {
//        head = null;
//    }
//
//    Node insert(int val) {
//        Node node = new Node(val);
//
//        if(head == null) {
//            head = node;
//            return head;
//        }
//
//        Node current = head;
//
//        while(current.next != null) {
//            current = current.next;
//        }
//
//        current.next = node;
//
//        return head;
//    }
//
//    void display(Node node) {
//        Node current = head;
//        while(current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//    }
//}
//public class Swap_nodes_pairs {
//    static Scanner scn = new Scanner(System.in);
//    public static void main(String[] args) {
//        LinkedL list = new LinkedL();
//        int n = scn.nextInt();
//        for(int i=0;i<n;i++) {
//            list.insert(scn.nextInt());
//        }
//
//        list.display(list.head);
//
//
//
//    }
//}




import java.util.Scanner;

//class Node {
//
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

class LinkedL {
    Node head;
    LinkedL() {
        head = null;
    }

    Node insert(int val) {
        Node node = new Node(val);

        if(head == null) {
            head = node;
            return head;
        }

        Node current = head;

        while(current.next != null) {
            current = current.next;
        }

        current.next = node;

        return head;
    }

    void display(Node node) {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    Node swap_node_pairs(Node node) {
        if(node == null || node.next == null)
              return node;

        Node temp = new Node(0);
        temp.next = node;
        Node current = temp;

        while(current.next != null  && current.next.next != null) {
            Node first = current.next;
            Node second = current.next.next;
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = first;
        }
        return temp.next;
    }
}
public class Swap_nodes_pairs {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedL list = new LinkedL();
        int n = 4;
        int[] arr = {1,2,3,4};
        for(int i=0;i<n;i++) {
            list.insert(arr[i]);
        }

        list.display(list.head);
        list.swap_node_pairs(list.head);
        list.display(list.head);



    }
}
