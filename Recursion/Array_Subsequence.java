package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Array_Subsequence {
    static void subsequence(int index,List<Integer> ans, int[] arr,int n) {
        if(index == n) {
            for(int element : ans) {
                System.out.print(element + " ");
            }
            System.out.println();
            if(ans.size() == 0) {
                System.out.println("{}");
            }
            return;
        }
        subsequence(index+1,ans,arr,n);
        ans.add(arr[index]);
        subsequence(index+1,ans,arr,n);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int n = 3;
        ArrayList<Integer> ans = new ArrayList<>();
        subsequence(0,ans,arr,n);
    }
}
