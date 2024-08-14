package Sliding_Window_2_Pointers;

public class prefix_sum {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, -2, 7, 3};
        int n = arr.length;

        int[] prefix = new int[n];

//        System.out.println(prefix[0]);
        prefix[0] = arr[0];
        for(int i=1;i<n;i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i=0;i<n;i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.println();
        System.out.println(prefix[5] - prefix[2]);


    }
}
