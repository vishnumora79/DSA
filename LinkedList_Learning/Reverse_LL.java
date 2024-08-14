package LinkedList_Learning;

//class Node {
//    int data;
//    Node next;
//
//    Node(int key) {
//        data = key;
//        next = null;
//    }
//}

class Reverse_LinkedList {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
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
public class Reverse_LL {
    public static void main(String[] args) {
        Reverse_LinkedList list = new Reverse_LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.print("Actual linked list:");
        list.display();
        System.out.print("Reversed linked list:");
        list.reverse();
        list.display();
    }
}
