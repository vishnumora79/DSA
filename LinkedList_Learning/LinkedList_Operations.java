package LinkedList_Learning;
import LinkedList_Learning.Node;



class LinkedList1 {
    Node head;
    LinkedList1() {
        this.head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null)
              head = newNode;
        else {
            Node curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int data, int index) {
        Node newNode = new Node(data);
        Node current = head;
        for(int i = 0; i < index - 1 && current != null;i++) {
            current = current.next;
        }
        if(current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void delete(int data) {

    }
}


public class LinkedList_Operations {
}
