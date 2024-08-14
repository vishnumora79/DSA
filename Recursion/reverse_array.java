package Recursion;

import java.util.Arrays;

public class reverse_array {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//    Approach with two pointers
//    static void reverse(int[] arr,int l,int r) {
//        if(l >= r)
//            return;
//        swap(arr,l,r);
////        int temp = arr[l];
////        arr[l] = arr[r];
////        arr[r] = temp;
//        reverse(arr,l+1,r-1);
//    }

//    Approach with single pointer
    public static void reverse(int[] arr,int i) {
        int n = arr.length;
        if(i >= n / 2)
             return;
        swap(arr,i,n-i-1);
        reverse(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,6};
        int n = arr.length;
//        reverse(arr,0,n-1);
        reverse(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
