package Recursion.Array_Problems;


// Method - 1
//import java.util.Arrays;
//
//public class Reverse_Array {
//    static void reverse(int[] arr, int left, int right) {
//        if(left >= right)
//             return;
//
//        int temp = arr[left];
//        arr[left] = arr[right];
//        arr[right] = temp;
//
//        reverse(arr, left+ 1, right - 1);
//    }
//    public static void main(String[] args) {
//        int[] arr = {4,3,6,2,76};
//        reverse(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//    }
//}

// Method - 2

import java.util.Arrays;

public class Reverse_Array {
    static void reverse(int[] arr, int i, int n) {
        if(i >= (n/2))
            return;

        int temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - i - 1] = temp;

        reverse(arr, i + 1, n);
    }
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,76};
        reverse(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

