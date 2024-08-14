import java.util.Scanner;
public class stack_operations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the maximum size of stack:");
        int n = s.nextInt();
        int top = -1;
        int[] stack = new int[n];
        int exit = 0;
        while(exit != 1){
            System.out.println("Enter the operation you want to perform:");
            String op = s.next();
            switch (op) {
                case "push":
                    if(top == n-1) {
                        System.out.println("Stack overflow");
                        break;
                    }
                    else {
                        System.out.println("Enter the element to insert:");
                        int a = s.nextInt();
                        top++;
                        stack[top] = a;
                        break;
                    }
                case "pop":
                    if(top == -1) {
                        System.out.println("Stack underflow");
                        break;
                    }
                    else {
                        int c = stack[top];
                        top--;
                        System.out.println("popped element is :"+c);
                        break;
                    }
                case "peek":
                    if(top == -1) {
                        System.out.println("stack is empty");
                        break;
                    }
                    else {
                        System.out.println(stack[top]);
                        break;
                    }
                case "display":
                    for(int i = top;i>=0;i--) {
                        System.out.print(stack[i] + " ");
                    }
                    System.out.println();
                    break;
                case "exit":
                    exit = 1;
                    break;
                case "default":
                    System.out.println("Enter the correct stack operation");
                    break;
            }
        }
    }
}
