package Recursion.Array_Problems;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;

public class search {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,5, 4,3,5};
        int target = 5;
        boolean ans = search(arr, target, 0);
        System.out.println(ans);
        int index = findIndex(arr, target, 0);
        System.out.println(index);
//        ArrayList<Integer> list = new ArrayList<>();
//        list = findAllIndex(arr, target, 0, list);
//        System.out.println(list.toString());
//        Or
        ArrayList<Integer> list = findAllIndex(arr, target, 0, new ArrayList<>());
        System.out.println(list);

        ArrayList<Integer> result = findAllIndex2(arr, target, 0);
        System.out.println(result);



    }
    public static boolean search(int[] arr, int target, int i) {
        if(i == arr.length-1)
            return false;
        return arr[i] == target || search(arr, target, i + 1);
    }

    public static int findIndex(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target)
            return i;
        else {
            return findIndex(arr, target, i + 1);
        }
    }
        public static ArrayList<Integer> findAllIndex(int[] arr, int target, int i, ArrayList<Integer> ans) {
            if(i == arr.length)
                return ans;

            if(arr[i] == target)
                ans.add(i);
            return findAllIndex(arr, target, i + 1, ans);

        }

    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length)
            return list;

        if(arr[i] == target)
            list.add(i);

        ArrayList<Integer> ans = findAllIndex2(arr, target, i + 1);
        list.addAll(ans);
        return list;

    }

}
