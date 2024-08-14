import java.util.Scanner;
public class recursion_remove_duplicate {
    static Scanner s = new Scanner(System.in);


//    Brute Force Approach
//    public static void main(String[] args) {
//        System.out.print("Enter the string:");
//        String s1 = s.next();
//        int n = s1.length();
//        String s2 = "";
//        if(s1 == null || n <= 1){
//            System.out.println(s1);
//        }
//        else {
//            s2 += s1.charAt(0);
//            for(int i=1;i<=n-1;i++) {
//
//                if(s1.charAt(i-1) == s1.charAt(i)) {
////                s2 = s1.replace(String.valueOf(s1.charAt(i)),"");
//                    continue;
//                }
//
//                else {
//                    s2 += s1.charAt(i);
//                }
//            }
//            System.out.print(s2 + " ");
//        }
//    }



//    Recursion
public static void main(String[] args) {
    System.out.println("Enter the string:");
    String s1 = s.next();
    System.out.println(remove(s1));
}
static String remove(String s1) {
    if (s1 == null || s1.length() == 1) {
        return s1;
    }
    char first = s1.charAt(0);
    char second = s1.charAt(1);

    if(first == second) {
       return remove(s1.substring(1));
    }
    else {
        return first + remove(s1.substring(1));
    }
}
}
