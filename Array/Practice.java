package Array;

//class Box<T> {
//    private T content;
//    public void setContent(T content) {
//        this.content = content;
//    }
//    public T getContent() {
//        return content;
//    }
//}
//public class Practice {
//    public static void main(String[] args) {
//        Box<Integer> intBox = new Box<>();
//        intBox.setContent(123);
//
//        Box<String> strBox = new Box<>();
//        strBox.setContent("Vishnu");
//
//        System.out.println(intBox.getContent());;
//        System.out.println(strBox.getContent());
//    }
//}
//
//import java.util.*;
// class ArrayListQuestion {
//
//    public static void main(String[] args) {
//
//        ArrayList<String> colors1 = new ArrayList<>();
//
//        colors1.add("red");
//
//        colors1.add("green");
//
//        colors1.add("blue");
//
//        colors1.add("yellow");
//
//
//
//        ArrayList<String> colors2 = new ArrayList<>(colors1);
//
//        colors2.add("orange");
//
//        colors2.add("purple");
//
//        colors2.add("pink");
//
//        System.out.println(colors2.get(5));
//
//    }
//}

//import java.util.ArrayList;
//
//
// class ArrayListModification {
//
//    public static void main(String[] args) {
//
//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("apple");
//
//        fruits.add("banana");
//
//        fruits.add("cherry");
//
//        fruits.add("date");
//
//
//
//        fruits.add(2, "elderberry");
//
//        fruits.remove(4);
//
//
//
//        System.out.println(fruits);
//    }
//
//}


class Swap {
    static class Pair
    {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    static void swap(Pair p) {
        int temp = p.a;
        p.a = p.b;
        p.b = temp;
    }
    public static void main(String[] args) {
//        int a = 10, b= 20;
//        Pair p = new Pair(a, b);
//        swap(p);
//        System.out.println(p.a + " " + p.b);

    }
}