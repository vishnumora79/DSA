package Logical_placements;

//public class Test {
//    public static int  get() {
//        return 0;
//    }
//    public static long get() {
//        return 1;
//    }
//    public static void main(String[] args) {
//        Test bj = new Test();
//        System.out.println(bj.get());
//    }
//}


//class Test {
//    private String function() {
//        return "GFG";
//    }
//
//    public final static String function() {
//        return "GeeksforGeeks";
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        System.out.println(t.function());
//    }
//}

//class Test {
//    private int data = 5;
//    public int getData() return this.data;
//    public int getData(int val) return data + 1;
//    public int getData(int... val) return data + 2;
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        System.out.println(t.getData(7, 8, 12));
//    }
//}

//class Mulrithreaded {
//    public static void main(String[] args) {
//        Thread t = Thread.currentThread();
//        t.setName("New Thread");
//        System.out.println(t);
//    }
//}

//class Output {
//    public static void main(String[] args) {
//        int a = Character.MIN_VALUE;
//        System.out.println((char) a);
//    }
//}

//class  Test {
//    public static void main(String[] args) {
////        Integer i = new Integer(257);
////        byte x = i.byteValue();
////        System.out.println(x);
//        System.out.println(5.1f);
//    }
//}

import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] a = {1,2,1};
        for(int num : a) {
            arr.add(num);
        }

        for(int num : arr) {

            int cnt = 0;
            for(int n : arr) {
                if(n == num)
                      cnt++;
            }
            System.out.println("Number is :" + num + " and its frequency is:" + cnt);
        }

    }
}