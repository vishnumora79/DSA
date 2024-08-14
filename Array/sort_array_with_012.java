package Array;

import java.util.ArrayList;

public class sort_array_with_012 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        int n = arr.size();

        int cnt1 = 0,cnt2 = 0,cnt3 = 0;
        for(int i=0;i<n;i++)  {
            if(arr.get(i) == 0)
                cnt1++;
            else if(arr.get(i) == 1)
                cnt2++;
            else
                cnt3++;
        }

        for(int i=0;i<cnt1;i++) {
            arr.set(i, 0);
        }

        for(int i=cnt1;i<cnt1 + cnt2;i++) {
            arr.set(i, 1);
        }

        for(int i=cnt1 + cnt2;i<n;i++) {
            arr.set(i, 2);
        }

        for(int i=0;i<n;i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
