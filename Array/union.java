package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        int[] a = {1,2,2,3,4,5};
        int[] b = {5,6,6,4,3};

        int n1 = a.length, n2 = b.length;

        for(int i=0;i<n1;i++) {
            set.add(a[i]);
        }
        for(int i=0;i<n2;i++) {
            set.add(b[i]);
        }

        for(int it : set) {
            union.add(it);
        }
        for(int it : union)
        System.out.print(it + " ");
    }
}
