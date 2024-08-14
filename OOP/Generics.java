package OOP;

class Test<T> {
    T obj;
    Test(T obj) {
        this.obj = obj;
    }
    T get() {
        return this.obj;
    }
     <T> void genericMethod(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}

//class Test<T,U> {
//    T obj1;
//    U obj2;
//
//    Test(T obj1, U obj2) {
//        this.obj1 = obj1;
//        this.obj2 = obj2;
//    }
//
//    public void print() {
//        System.out.println(obj1);
//        System.out.println(obj2);
//    }
//
//}
public class Generics {
    static <T> void genericMethod(T element) {
        System.out.println(element.getClass() + " = " + element);
    }
    public static void main(String[] args) {
//        Test<Integer, String> iobj = new Test<>(15, "Vishnu");
//        iobj.print();

//        Test<Integer, String> sobj = new Test<>(12, "Kishore");
//        sobj.print();
        genericMethod(14);
    }
}
