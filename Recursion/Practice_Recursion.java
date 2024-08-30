package Recursion;

//Recursion Dry Run
//public class Practice_Recursion {
//    static int cnt = 0;
//    void recur_fun() {
//        if(cnt == 7)
//             return;
//        System.out.println(cnt);
//        cnt++;
//        recur_fun();
//    }
//    public static void main(String[] args) {
//        Practice_Recursion obj = new Practice_Recursion();
//        obj.recur_fun();
//    }
//}

// Print name 7 times

//import java.util.Scanner;
//
//class Practice_Recursion {
//    static void print(int i, int n) {
//        if(i > n)
//             return;
//        System.out.println("Vishnu");
//        print(i + 1, n);
//
//    }
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        print(1, n);
//    }
//}


// print from 1 to n
import java.util.ArrayList;
import java.util.Scanner;

//public class Practice_Recursion {
//    static void print(int i, int n) {
//        if(i > n)
//              return;
//        System.out.print(i + " ");
//        print(i + 1, n);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        print(1, n);
//    }
//}

// print from n to 1

//public class Practice_Recursion {
//    static void print(int n) {
//        if(n == 0)
//            return;
//        System.out.print(n + " ");
//        print(n-1);
////        System.out.print(n + " ");
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        print(n);
//    }
//}

// print 1 to n without incrementing i

//public class Practice_Recursion {
//    static void print(int i, int n) {
//        if(i > n)
//            return;
//        System.out.print(i + " ");
//        print(i + 1, n);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        print(1, n);
//    }
//}

// Sum of first n numbers

// Method - 1
//public class Practice_Recursion {
//    static void print(int i, int n, int sum) {
//
//        if(i > n) {
//            System.out.println(sum);
//            return;
//        }
//        print(i + 1, n, sum + i);
//
////        return sum;
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        print(1, n, 0);
//    }
//}

// Method - 2
//public class Practice_Recursion {
//    static void print(int n, int sum) {
//
//        if(n == 0) {
//            System.out.println(sum);
//            return;
//        }
//        print(n-1, sum + n);
//
////        return sum;
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        print(n, 0);
//    }
//}

// Method - 3

//public class Practice_Recursion {
//    static int print(int n) {
//        if(n == 0)
//            return 0;
//        return n + print(n - 1);
//
//    }
//    public static void main(String[] args) {
//        int n = 3;
//        System.out.println(print(n));
//    }
//}


//// Factorial of n
//public class Practice_Recursion {
//    static int print(int n) {
//        if(n == 0)
//            return 1;
//        return n * print(n - 1);
//
//    }
//    public static void main(String[] args) {
//        int n = 3;
//        System.out.println(print(n));
//
//        double ans = Math.sqrt(n);
//    }
//}

//// Fibonacci of n
//public class Practice_Recursion {
//    static int fibo(int n) {
//        if(n <= 1)
//            return n;
//        return fibo(n - 1) + fibo(n - 2);
//
//    }
//    public static void main(String[] args) {
//        int n = 3;
//        System.out.println(fibo(n));
//    }
//}


// Subsequence of an array
//Concept : Pick and Non Pick


// Factorial of n
//import java.util.List;
//import java.util.ArrayList;
//public class Practice_Recursion {
//    static void subsequence(int i, List<Integer> ds, int[] arr) {
//        if(i == arr.length) {
//         for(int num : ds)
//             System.out.print(num + " ");
//         if(ds.size() == 0)
//             System.out.print("{}");
//
//            System.out.println();
//         return;
//        }
//
//        ds.add(arr[i]);
//        subsequence(i+1, ds, arr);
//        ds.remove(ds.get(ds.size()-1));
//        subsequence(i+1, ds, arr);
//    }
//    public static void main(String[] args) {
////        int[] arr = {3, 1, 2};
////        int n = arr.length;
////        List<Integer> ds = new ArrayList<>();
////        subsequence(0, ds, arr);
//
//        int a = 2, b = 2;
//        int ans = Integer.compare(b, a);
//        System.out.println(ans);
//    }
//}


//// Factorial of n
public class Practice_Recursion {
    static int print(int n, int sum) {
        if(n == 0)
            return sum;
        return n + print(n - 1, 0);

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(print(n, 0));

//        double ans = Math.sqrt(n);
    }
}

