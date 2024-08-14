package Array;
//
//public class negitive_subarrays {
//    public static void main(String[] args) {
//        int[] arr = {1, - 2, 4, - 5, 1};
//        int n = arr.length;
//        int cnt = 0;
//        int ans = 0;
//        for(int i=0;i<n;i++) {
//            int sum = 0;
//            for(int j=i;j<n;j++) {
//                sum += arr[j];
//                ans += sum;
//                if(ans < 0)
//                    cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }
//}

//import java.util.*;
//        import java.lang.*;
//        import java.io.*;
//
//class Codechef
//{
//    static Scanner scn = new Scanner(System.in);
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        int T = scn.nextInt();
//        for(int i=0;i<T;i++) {
//            int A = scn.nextInt();
//            int B = scn.nextInt();
//            int C = scn.nextInt();
//            int D = scn.nextInt();
//
//            int Acost = A - C;
//            int Bcost = B - D;
//
//            if(Acost == Bcost) {
//                System.out.println("Any");
//            }
//            else if(Acost < Bcost) {
//                System.out.println("First");
//            }
//            else  {
//                System.out.println("Second");
//            }
//
//        }
//    }
//}
//
//
class shifting_vowels {
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        String str = "College";
        char[] arr = str.toCharArray();
        int n = str.length();
        int start = 0;
        int end = n - 1;
        while (start < end) {

            if (!isVowel(arr[start])) {
                start++;
                continue;
            }
            if (!isVowel(arr[end])) {
                end--;
                continue;
            }
            if (!isVowel(arr[start]) && !isVowel(arr[end])) {
                start++;
                end--;
            }

            if (isVowel(arr[start])) {
                if (isVowel(arr[end])) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    break;
                }
            }
        }
        System.out.println(new String(arr));
    }
}

