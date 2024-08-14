package LinkedList_Learning;

class Node_d {
    int data;
    Node_d next;

    Node_d(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList_d {
    Node_d head;
    LinkedList_d() {
        this.head = null;
    }

    void insert(int data){
        Node_d node = new Node_d(data);
        if(head == null) {
            head = node;
            return;
        }
        Node_d current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    void deleteNode(int key) {
        Node_d temp = head;
        Node_d prev = null;

        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("Given element to delete is not present in the linked list");
            return;
        }


        prev.next = temp.next;
    }

    void deleteLast() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node_d secondLast = head;
        while(secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    void deleteFirst() {
        if(head != null) {
            head = head.next;
        }
    }

    void display() {
        Node_d current = head;
        if(current == null)
            System.out.println("Linked list is empty");
        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class LinkedList_deletion {
    public static void main(String[] args) {
        LinkedList_d list = new LinkedList_d();
        list.display();
        list.insert(56);
        list.insert(6);
        list.insert(68);
        list.insert(89);
        list.insert(45);
        list.insert(23);
        list.display();
        list.deleteNode(90);
        list.deleteFirst();
        list.deleteLast();
        list.display();

    }
}
