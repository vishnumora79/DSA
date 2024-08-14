package LinkedList_Learning;

class Node_Str {
    String data;
    Node_Str next;

    Node_Str(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList_Str {
    Node_Str head;
    public void insert_Str(String data) {
        Node_Str node = new Node_Str(data);
        if(head == null) {
            head = node;
        }
        else {
            Node_Str current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insert_AtBeginning(String data) {
        Node_Str node = new Node_Str(data);
        if(head == null) {
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    public Node_Str findMiddleNode() {
        if(head == null) {
            return null;
        }
        Node_Str slow_pointer = head;
        Node_Str fast_Pointer = head;
        while(fast_Pointer != null && fast_Pointer.next != null) {
            slow_pointer = slow_pointer.next;
            fast_Pointer = fast_Pointer.next.next;
        }
        return slow_pointer;

    }
    public void display() {
        Node_Str current = head;
        if(current == null) {
            System.out.println("Linked list is empty");
        }
        else {
            while(current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
public class Linkedlist_practice {
    public static void main(String[] args) {
        LinkedList_Str list = new LinkedList_Str();
//        list.display();
        list.insert_Str("Vishnu");
        list.insert_Str("Anju");
        list.insert_Str("Varalakshmi");
        list.insert_Str("Venkata Narayana");
        list.display();
        Node_Str middleNode = list.findMiddleNode();
        if(middleNode != null)
            System.out.println("Middle Node:" + middleNode.data);
        else
            System.out.println("The  list is empty.");


    }
}
