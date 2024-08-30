package LinkedList_Learning;

import java.util.Arrays;

public class Length_of_loop {
    static void fun(int[] arr, Integer temp) {
        arr[0] = arr[0] + 1;
        temp += 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int a = 1;
        int x = Integer.MAX_VALUE;
        System.out.println(x);
//        Integer temp = new Integer(a);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("a value is:" + temp);
//        fun(arr, temp);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("a value is:" + temp);
    }
}
