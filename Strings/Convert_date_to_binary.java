package Strings;

import java.util.Arrays;

public class Convert_date_to_binary {
    public static void main(String[] args) {
        String date = "2080-02-29";

        String[] strs = date.split("-");
        String[] ans = new String[3];
        System.out.println(Arrays.toString(strs));
        for(int i=0;i<3;i++) {
            int temp = Integer.parseInt(strs[i]);
            String x = Integer.toBinaryString(temp);
            ans[i] = x;
//            System.out.println(str);
        }
        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.toString(ans));
        String a = String.join("-", ans[0], ans[1], ans[2]);
        System.out.println(a);
//        int year = 2;
//        String binary = Integer.toBinaryString(year);
//        System.out.println(binary);
    }
}
