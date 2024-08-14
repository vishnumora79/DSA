package Strings;

import java.util.ArrayList;
import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
//        String s = "Vishnu";
//        String s1 = "Vishnu";
//        s1 = "Vishnu Vardhan";
//        System.out.println(s + " " + s1);
//        String s2 = new String("Vishnu");
//        System.out.println(s2);
//        String[] str = s1.split(" ");
//        for(int i = 0; i < str.length;i++) {
//            System.out.println("array elements : " + str[i]);
//        }
//        StringBuilder sb = new StringBuilder();
//        System.out.println("Initial capacity:" + sb.capacity());
//        System.out.println(sb);
//        sb.append(1);
//        sb.append(6.7);
//        sb.append('c');
//        System.out.println(sb.length());
//        for(int i = 0; i < sb.length();i++)
//            System.out.println(sb.charAt(i));

//        StringBuilder[] sb = new StringBuilder[5];
//        System.out.println(sb.length);
//        for(int i = 0; i < sb.length;i++) {
//            sb[i] = new StringBuilder();
//        }
//        for(int i = 0 ; i < sb.length;i++) {
//            sb[i].append(3);
//        }
//        for(int i = 0;i < sb.length;i++)
//           System.out.println(sb[i].charAt(0));

//        byte[] ascii = {65,66,67,68};
//        char[] chars = {'f','h','f'};
//        String str = new String(ascii);
//        System.out.println(str);
//        String str1 = new String(chars);
//        System.out.println(str1);
//        String s1 = "vishnu";
//        String s2 = "vishnuvardhan";
//        int s = s1.compareTo(s2);
//        System.out.println("Lexicographical order:" + s);

        String s1 = "BSS";
        String s2 = "ASS";
        System.out.println(s1.indexOf('S'));
        System.out.println(s1.lastIndexOf('S'));
        System.out.println(s1.toLowerCase(Locale.ROOT));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains("ss"));
        System.out.println(s1.startsWith("B"));
        System.out.println(s1.intern());
    }
}
