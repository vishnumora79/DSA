package Recursion;

import java.util.Scanner;

//public class Print_1_to_n {
//    static Scanner s = new Scanner(System.in);
//    static void print(int n) {
//        if(n < 1)
//             return;
//        System.out.println(n);
//        print(n-1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter N:");
//        int n = s.nextInt();
//        print(n);
//    }
//}


//public class Print_1_to_n {
//    static Scanner s = new Scanner(System.in);
//    static void print(int i,int n) {
//        if(i < 1)
//              return;
//        print(i-1,n);
//        System.out.println(i);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter N:");
//        int n = s.nextInt();
//        print(n,n);
//    }
//}

public class Print_1_to_n {
    static void print(int i, int n) {
        if(i > n)
            return;
        print(i+1,n);
        System.out.println(i);
    }
   static Scanner s  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter N:");
        int n = s.nextInt();
        print(1,n);

    }
}