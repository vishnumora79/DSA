package Recursion;

public class Sum_first_n_numbers {
//    First Approach
//    public static void sum_n(int i,int sum) {
//        if(i < 1) {
//            System.out.println(sum);
//            return;
//        }
//        sum_n(i-1,sum + i);
//    }
//
//    public static void main(String[] args) {
//        int n = 3;
//        sum_n(n,0);
//    }

//    Second Approach
    static int sum(int n) {
        if(n == 0)
            return 0;
        return n + sum(n-1);
    }
public static void main(String[] args) {
    int n = 4;
    System.out.println(sum(n));
}
}
