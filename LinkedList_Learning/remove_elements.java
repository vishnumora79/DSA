package LinkedList_Learning;

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

class LL_remove_elements {
    Node head;
    public void insert(int data) {
        Node node = new Node(data);
        if(head == null)
            head = node;
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void remove(int data) {
        while(head != null && head.data == data) {
            head = head.next;
        }
        Node current = head;
        while(current != null && current.next != null) {
            if(current.next.data == data)
                current.next = current.next.next;
            else
                current = current.next;
        }
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

public class remove_elements {
    public static void main(String[] args) {
        LL_remove_elements list = new LL_remove_elements();
//        list.insert(2);
//        list.insert(6);
//        list.insert(7);
//        list.insert(6);
//        list.insert(5);

        list.insert(7);
        list.insert(7);
        list.insert(7);
        list.insert(7);
        System.out.println("initial linked list:");
        list.display();
        System.out.println("Linked list after removing certain element:");
        list.remove(7);
        list.display();
    }
}
