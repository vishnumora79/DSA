package Recursion.Array_Problems;

public class array_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2};
        boolean ans = main(arr, 0);
        System.out.println(ans);

    }
    public static boolean main(int[] arr, int i) {
        if(i == arr.length - 1)
            return true;
        return arr[i] < arr[i + 1] && main(arr, i + 1);
    }
}
