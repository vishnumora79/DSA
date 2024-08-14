package Recursion;

//public class Basics {
//    public static void main(String[] args) {
//        printn(1);
//    }
//    static void printn(int n) {
//        if(n > 5)
//             return;
//        System.out.println(n);
//        printn(n + 1);
//    }
//
//}

//public class Basics {
//    public static void main(String[] args) {
//        int n = 7;
//        System.out.println(fibo(n));
//    }
//    static int fibo(int n) {
//        if(n < 2)
//             return n;
//        return fibo(n - 1) + fibo(n - 2);
//    }
//}

//public class Basics {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,66,78};
//        int n = arr.length;
//        int target = 1;
//        System.out.println(search(arr, target, 0, n - 1));
//    }
//    static int search(int[] arr, int target, int start, int end) {
//        if(start > end)
//             return -1;
//        int mid = start + (end - start) / 2;
//        if(arr[mid] == target)
//            return mid;
//
//        if(target < arr[mid]) {
//            return search(arr, target, 0, mid - 1);
//        }
//        return search(arr, target, mid + 1, end);
//    }
//   }
//
//public class Basics {
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(fact(n));
//    }
//    static int fact(int n) {
//        if(n == 0)
//            return 1;
//        return n * fact(n - 1);
//    }
//}

//public class Basics {
//    public static void main(String[] args) {
//        int n = 55;
//        System.out.println(digitSum(n));
//    }
//    static int digitSum(int n) {
//        if(n % 10 == n)
//            return n;
//        int rem = n % 10;
//        n /= 10;
//        return rem * digitSum(n);
//    }
//}
//
//public class Basics {
//    public static void main(String[] args) {
//        int n = 5;
//        print(n);
//    }
//    static void print(int n) {
//        if(n == 0)
//              return;
//        System.out.println(n);
//        print(--n);
//    }
//}

public class Basics {
    public static void main(String[] args) {
        int n = 3421;
        int digits = (int)Math.log10(n) + 1;
        System.out.println(reverse(n, digits));
    }
    static int reverse(int n, int digits) {
       if(digits == 0)
           return 1;
       int rem = n % 10;
       return rem * (digits - 1) + reverse(n/10, digits - 1);
    }
}



