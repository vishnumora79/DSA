package LinkedList_Learning;

class Single_circle {
    Node head = null;
    public void add(int data) {
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
    public void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data);
            if(current.next != null)
                System.out.print("->");
            current = current.next;
        }
    }
    public void circular() {
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = head;

        Node node = head.next;
        while(node != head) {
            System.out.print(node.data);
            node = node.next;
        }
    }
    public void reverse() {
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

}
public class Singly_to_circular {
    public static void main(String[] args) {
          Single_circle ll = new Single_circle();
          ll.add(1);
          ll.add(2);
          ll.add(3);
          ll.add(4);
          ll.add(5);
         ll.display();
        System.out.println();
         ll.circular();
    }
}
