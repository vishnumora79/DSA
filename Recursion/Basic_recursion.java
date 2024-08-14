package Recursion;

public class Basic_recursion {
    static int cnt = 0;
    static void recursion_function() {
        if(cnt == 3) {
            return;
        }
        System.out.println(cnt);
        cnt++;
        recursion_function();
    }
    public static void main(String[] args) {
        recursion_function();
    }
}
