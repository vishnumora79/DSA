package Strings;

import java.util.*;
public class Digits_sum {
    private static int helper_function(String s, int k){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            int x = c - 'a' + 1;
            sb.append(Integer.toString(x));
        }
        s = sb.toString();
        while(k != 0) {
            int x = 0;
            for(char c : s.toCharArray()) {
                x += c - '1' + 1;
            }
            s = Integer.toString(x);
            k--;
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        String str = "leetcode";
        int n = str.length();
        int k = 2;
        int ans = helper_function(str, k);
        System.out.println(ans);
    }
}
