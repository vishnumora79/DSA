package LinkedList_Learning;

class Node {
    int data;
    Node next;
    //        Constructor to initialize the node with data and next pointer
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node findMiddleNode() {
        if(head == null)
            return null;
        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }
    public void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Linkedlist_creation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        System.out.println("Linked List:");
        list.display();

        Node middleNode = list.findMiddleNode();
        if(middleNode != null)
            System.out.println("Middle Node:" + middleNode.data);
        else
            System.out.println("The  list is empty.");

    }

}
