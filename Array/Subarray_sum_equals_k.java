package Array;

import java.util.Scanner;

public class Subarray_sum_equals_k {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("Enter the size of array:");
//        int n = s.nextInt();
          int  n = 10;
//          int[] a = new int[n];
          int[] a = {1,2,3,-3,1,1,1,4,2,-3};
//        System.out.println("The elements are:");
//        for(int i=0;i<n;i++) {
//            a[i] = s.nextInt();
//        }

//        System.out.println("Enter the k value:");
//        int k = s.nextInt();
        int k = 3;

//        Brute Force Approach


//        int count = 0;
//        for(int i=0;i<n;i++) {
//            for(int j = i;j<n;j++) {
//                int sum = 0;
//                for(int x = i;x<=j;x++) {
//                    sum += a[x];
//                }
//                if(sum == k) {
//                    count++;
//                }
//            }
//        }
//        System.out.println("Number of subarrays with sum equals to k is:" + count);


//        Better Approach
//        int count = 0;
//        for(int i=0;i<n;i++) {
//            int sum = 0;
//            for(int j=i;j<n;j++) {
//                sum += a[j];
//                if(sum == k)
//                    count++;
//            }
//        }
//        System.out.println("Total number of sub arrays with their sum equals to k is:" + count);
    }
}
