package Strings;
import java.util.Scanner;
public class move_character_occurances_to_end {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Give the string:");
        String str = s.next();
        StringBuilder X = new StringBuilder();
        StringBuilder noX  = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(c == 'x') {
                X.append('x');
            }
            else {
                noX.append(c);
            }
        }
        System.out.println(noX.toString() + X.toString());
    }
}
