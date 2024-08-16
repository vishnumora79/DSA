package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_sort {
    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= high) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int x=low;x<=high;x++) {
            arr[x] = temp[x - low];
        }
    }
    public static void mergeSort(int[] arr, int low, int high) {
        if(low == high)
            return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        int n = arr.length;
        mergeSort(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));

    }
}
