package Strings;
import java.util.*;
public class String_compression {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        String str = scn.next();
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        int cnt = 1;
        for(int i = 1; i < n;i++) {
            if(str.charAt(i) == str.charAt(i-1))
                  cnt++;
            else {
                ans.append(str.charAt(i - 1));
                    ans.append(cnt);
                cnt = 1;
            }
        }
        ans.append(str.charAt(n - 1));
            ans.append(cnt);
        System.out.println(ans.toString());
    }
}
