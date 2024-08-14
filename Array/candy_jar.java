package Array;

public class candy_jar {
    public static void main(String[] args) {
        int n = 10;
        int k = 5;

        int ordered = 3;

        int remaining = n - ordered;

        if(remaining < k)
            System.out.println("Invalid input");
        else
            System.out.println(remaining);
    }
}
