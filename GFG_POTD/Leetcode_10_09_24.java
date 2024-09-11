package GFG_POTD;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Leetcode_10_09_24 {
    public static void main(String[] args) {

    }
        // Problem lies in gcd calculation
        // private static int gcd(int a, int b) {
        //     int smaller = a;
        //     if(a > b)
        //       smaller = b;
        //     int gcd = 1;
        //     for(int i=1;i<=smaller;i++) {
        //         if(a % i == 0 && b % i == 0) gcd = i;
        //     }
        //     return gcd;
        // }

        // Euclidian algorithm
        private  static int gcd(int a, int b) {
            while(b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public ListNode insertGreatestCommonDivisors(ListNode head) {
            ListNode curr = head;
            int n = 0;
            while(curr != null) {
                n++;
                curr = curr.next;
            }
            // Edge case
            if(n <= 1)
                return head;

            curr = head;
            while(curr.next != null) {
                int a = curr.val;
                int b = curr.next.val;
                int gcd = gcd(a, b);
                ListNode node = new ListNode(gcd);
                node.next = curr.next;
                curr.next = node;

                curr = curr.next.next;
            }
            return head;
        }
    }

