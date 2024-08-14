package Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class Map_Example {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0) + 1);
        }
        for(Map.Entry<Integer,Integer> m : mpp.entrySet()) {
            System.out.print(m.getKey() + " -> " + m.getValue());
        }

    }
}
