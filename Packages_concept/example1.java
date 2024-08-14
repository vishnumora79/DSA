package Packages_concept;


class C1 {
    private int a = 2;
    public int b = 3;
    protected int z = 5;

    public void printA() {
        System.out.println("Value of a is :" + a);
    }
}
public class example1 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.printA();

    }
}
