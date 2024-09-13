package GFG_POTD;

import java.util.Scanner;

public class RGB_Accenture {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
//        String s = scn.next();
//        String t = scn.next();

        String s = "RRB";
        String t = "RRB";

        int sLen = s.length();
        int tLen = t.length();

        int j = 0;
        for(int i=0;i < sLen;i++) {
            if(t.charAt(i) == s.charAt(j)) j++;
        }
        System.out.println(j + 1);
    }
}
