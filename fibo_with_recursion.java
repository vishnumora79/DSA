//import java.util.Scanner;
//public class fibo_with_recursion {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n = s.nextInt();
//        for(int i=0;i<n;i++) {
//            System.out.print(fibo(i) + " ");
//        }
//    }
//    public static int fibo(int n) {
//        if(n == 0) {
//            return 0;
//        }
//        else if(n == 1) {
//            return 1;
//        }
//        else {
//            return fibo(n-1) + fibo(n-2);
//        }
//    }
//}

import java.util.Scanner;

public class fibo_with_recursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = s.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print(fibo(i) + " ");
        }
    }
    public static int fibo(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}