package LinkedList_Learning;

//class Node {
//    int  data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
class LinkedList_sort {
    Node head;

    LinkedList_sort() {
        this.head = null;
    }
//    Method to insert an element at the end of linked list
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

    public void mergeSort() {
        head = mergeSort(head);
    }

    Node mergeSort(Node head) {
        if(head == null || head.next == null)
            return head;

//        Find the middle of the list

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;

//        Apply merge sort on left and right halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return merge(left,right);
    }

    Node merge(Node left,Node right) {
        Node result = null;

        if(left == null)
            return right;
        if(right == null)
            return left;

//        Recursively merge two lists
        if(left.data <= right.data) {
            result = left;
            result.next = merge(left.next,right);
        }
        else {
            result = right;
            result.next = merge(left,right.next);
        }
        return result;
    }

    Node getMiddle(Node head) {
        if(head == null)
            return head;

        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public void display() {
        if(head == null) {
            System.out.println("Linked List is empty.");
        }
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedList_sorting {
    public static void main(String[] args) {
        LinkedList_sort list = new LinkedList_sort();

//        Add elements to the linked list
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(7);
        list.insert(1);

        System.out.println("Linked List before sorting:");
        list.display();
//        Sorting linked list using Merge Sort
        list.mergeSort();

//        Display the sorted linked list
        System.out.println("Sorted Linked List:");
        list.display();

    }
}
