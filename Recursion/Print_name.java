package Recursion;

import java.util.Scanner;


public class Print_name {
    static void print(int cnt,int n) {
        if(cnt > n) {
            return;
        }
        System.out.println("Vishnu");
        print(cnt+1,n);
    }
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of times to print name:");
        int n = s.nextInt();
        print(1,n);
    }
}
