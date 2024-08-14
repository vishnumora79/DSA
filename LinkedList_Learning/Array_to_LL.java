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

class Array_LL {
    Node head;
    public void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }
    public boolean search(int val) {
        Node current = head;
        while(current != null) {
            if(current.data == val)
                return true;
            current = current.next;
        }
        return false;
    }
    public void display() {
        Node current = head;
        int cnt = 0;
        while(current != null) {
            cnt++;
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println("Length of the Linkedlist is : " + cnt);
    }
}
public class Array_to_LL {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6,2};
        int n = arr.length;
        Array_LL list = new Array_LL();
        for(int i=0;i<n;i++) {
            list.insert(arr[i]);
        }
        System.out.print("Linked list is :");
        list.display();
        boolean isAvail =  list.search(5);
        if(isAvail == true)
            System.out.println("Element is present in the linked list");
        else
            System.out.println("Element is not present in the linked list");
    }
}
