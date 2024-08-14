import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class practice_code {
    static Scanner s = new Scanner(System.in);
//  public static void main(String[] args) {
//      practice_code p = new practice_code();
//      System.out.println(p.add(2,3));
//  }
//  public int add(int a,int b) {
//      int c = a + b;
//      return c;
//  }
//public static void main(String[] args) {
//    String name = "vishnu";
//    greet(name);
//    System.out.println(name + " ****");
//}
//public static void greet(String name) {
//    name = "vishnu vardhan";
//    System.out.println(name);
//}
//public static void main(String[] args) {
//    int a = 10;
//    int b = 20;
//    swap(a,b);
//    System.out.println(a + " " + b);
//}
//// swap method won't swap numbers
//public static void swap(int num1,int num2) {
//    int temp = num1;
//    num1 = num2;
//    num2 = temp;
//}
//    change the elements of an array
//public static void main(String[] args) {
//    int[] arr = {1,2,4,5,3};
//    convert(arr);
//    System.out.println(Arrays.toString(arr));
// }
// public static void convert(int[] nums) {
//    nums[0] = 99; // it replaces element in arr because nums and arr pointing to same array object
// }
//public static void main(String[] args) {
//    int a = 10;
//    int b = 20;
//    System.out.println(marks);
//}
//public static void  add(int a,int b) {
//    int marks = a + b;
//
//}

//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
////        If you initialize some variable in a block it will be in that block only - cannot access outside
//        {
//            a = 78; // reassigning the origin ref variable to some other value
//            int c = 99;
//            System.out.println(a);
//        }
////        System.out.println(c);  // cannot access the referance variable c
//        System.out.println(a);
//
//    }



//    swadowing
//static int x = 90;
//public static void main(String[] args) {
//    int x = 20;  // class variable is swadowed by this
//    // scope will begin when the value is initialized
//    System.out.println(x);
//    fun();
//}
//public static void fun() {
//    System.out.println(x);
//}
//
////    Variable length arguments - when we don't how many values to pass
//public static void main(String[] args) {
//    fun(2,3,5,5,3,5);
//    multiple_args(2,3,"Mora ","Vishnu ","Vardhan ", "Reddy ");
//}
//static void fun(int ...v) {
//    System.out.println(Arrays.toString(v));
//}
//static void multiple_args(int a,int b,String ...v) {
//    System.out.println(a + " " + b + " "  +  Arrays.toString(v));
//}

//    Function overloading
//public static void main(String[] args) {
//    fun(81);
//    fun("vishnu");
//}
//static void fun(int a) {
//    System.out.println(a);
//}
//static void fun(String name) {
//    System.out.println(name);
//}
//public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
//    int n = s.nextInt();
// printing all 3 - digit armstrong numbers
//    for(int i=100;i<1000;i++) {
//        if(armstring(i))
//        System.out.println(i + " ");
//    }



//static boolean armstring(int n) {
//    int original = n;
//    int sum = 0;
//    while( n > 0) {
//        int rem = n % 10;
//        sum += rem * rem * rem;
//        n /= 10;
//    }
//    return sum == original;
//}

//
//public static void main(String[] args) {
//    System.out.print("Enter the size of array:");
//    int n = s.nextInt();
////    int[] a = new int[n],result = new int[n];
//      int[] a = new int[n];
//      int[] result = new int[n];
//    System.out.print("Elements are:");
//    for(int i=0;i<n;i++) {
//        a[i] = s.nextInt();
//    }
//    for(int i=0;i<n;i++) {
//        if (a[i] >= a[i + 1]) {
//            result[i] = a[i + 1];
//        } else {
//            result[i] = a[i];
//        }
//    }
//        for(int i=0;i<result.length;i++) {
//            System.out.println(result[i]);
//        }
//
//}
//    public static void main(String args[]) {
//        int[][] problems = {{35,45},{13,6},{100,4}};
//        for(int[] row: problems) {
//            Arrays.sort(row);
//        }
////        System.out.println(Arrays.toString(problems));
//        for(int i=0;i<problems.length;i++) {
//            System.out.println(Arrays.toString(problems[i]));
//        }
//    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(gfg_coding1(n));
    }
    static int gfg_coding1(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        else {
            return 4 * (gfg_coding1(n-1) - gfg_coding1(n-2));
        }
    }
 }

