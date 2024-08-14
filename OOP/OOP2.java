package OOP;

class nested {
    static String name;
    nested(String name) {
        this.name = name;
    }
}
public class OOP2 {
//     static class nested {
//        String name;
//        nested(String name) {
//            this.name = name;
//        }
//    }
    public static void main(String[] args) {
        nested a = new nested("Vishnu");
        nested b = new nested("Kishore");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
