package LinkedList_Learning;

public class Iterative_reverse {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null) {
//            Before changing the next pointer, first store it
            next = current.next;
//            Now change the pointer
            current.next = prev;
            prev = current;
            current= next;
        }
         node = prev;
        return node;
    }

    void print(Node node) {
        Node current = node;
        while(current != null) {
            System.out.print(current.data);
            if(current.next != null)
                System.out.print(" -> ");
            current = current.next;
        }
    }

    public static void reverse(String[] arr, int start, int end) {
        while(start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
//        Iterative_reverse list = new Iterative_reverse();
//        list.head = new Node(1);
//        list.head.next = new Node(2);
//        list.head.next.next = new Node(3);
//        list.head.next.next.next = new Node(4);
//        list.head.next.next.next.next = new Node(5);
//        System.out.print("Original Linked list:");
//        list.print(head);
//        head = list.reverse(head);
//        System.out.println();
//        System.out.print("Reversed Linked list:");
//        list.print(head);
       String s = "the sky is blue";
       String[] ans = s.split(" ");
       reverse(ans, 0, ans.length-1);
       String res = String.join(" ", ans);
        System.out.println(res);


    }
}
