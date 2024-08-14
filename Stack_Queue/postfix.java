package Stack_Queue;
import java.util.Stack;
public class postfix {
    static int evaluate(String str) {
        Stack<Integer>
                stack = new Stack();

        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push(c - '0');
            }

            else {
                int a = stack.pop();
                int b = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
       String str = "231*+9-";
        System.out.println(evaluate(str));




    }
}
