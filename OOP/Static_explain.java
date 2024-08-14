package OOP;

public class Static_explain {
    static String college = "SIMATS";
    int x = 10;
    static void randomSMethod() {
        int a = 10;
        System.out.println("a is: " + a);
        System.out.println("This is a random method");
    }
    void randomMethod() {
        System.out.println("This is not a static method");
    }
    public static void main(String[] args) {
        Static_explain obj = new Static_explain();
        System.out.println("Calling non static method using object");
        obj.randomMethod();
        System.out.println(Static_explain.college);
        Static_explain.randomSMethod();
        System.out.println(obj.x);
    }
}
