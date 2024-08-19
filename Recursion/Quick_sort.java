package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quick_sort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
        return j;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length - 1;
        quickSort(arr, 0, n);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
}
