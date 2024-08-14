package Array;

import java.util.Arrays;

public class rotate_matrix_90 {
    public static void reverse(int[] arr) {
        int n = arr.length;
        int p1 = 0,p2 = n-1;
        while(p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }
    public static void main(String[] args) {
//        Brute Force Approach
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int n = matrix.length;
//        int[][] ans = new int[n][n];
//        for(int i=0;i<n;i++) {
//            for(int j=0;j<n;j++) {
//                ans[j][(n-1)-i] = matrix[i][j];
//            }
//        }
//        for(int i=0;i<n;i++) {
//            for(int j=0;j<n;j++) {
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }
//        Optimal Solution
//        1. Transpose Matrix
//        2. Reverse each row
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int[] arr = matrix[0];
//        System.out.println(Arrays.toString(arr));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
    }


}
