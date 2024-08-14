package Strings;
import java.util.Scanner;
public class Character_Multiplier {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
          String str = scn.next();
          int n = str.length();
          StringBuilder sb = new StringBuilder();
          char[] arr = str.toCharArray();
          for(int i=1;i<=n;i += 2) {
              int x = arr[i] - '0';
              for(int j = 0;j < x;j++) {
                  sb.append(str.charAt(i - 1));
              }
          }
        System.out.println(sb.toString());
    }
}
