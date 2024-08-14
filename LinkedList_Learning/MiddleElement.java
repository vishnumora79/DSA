package LinkedList_Learning;

import java.util.ArrayList;

class LL {
    Node head;
    LL() {
        head = null;
    }
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
    public Node middleElement() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
//        ArrayList<Node> middle = new ArrayList<>();
//        while(head != null) {
//            middle.add(head);
//            head = head.next;
//        }
//        int index = middle.size() / 2;
//        return middle.get(index);
    }

}
public class MiddleElement {
    public static void main(String[] args) {
        LL list = new LL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.println(list.middleElement().data);
    }
}
