import sun.awt.windows.WPrinterJob;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class queue {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int exit = 0;
        int front = -1, rear = -1;
        System.out.print("Enter the sze of queue:");
        int n = s.nextInt();
        rear++;
        int[] queue_array = new int[n];
        while(exit != 1) {
            System.out.println("Enter the operation to perform:");
            String op = s.next();
            switch(op) {
                case "enqueue":
                    System.out.println("Enter the element into queue:");
                    int ele = s.nextInt();
                    if(front == n-1) {
                        System.out.println("Queue is full");
                    }
                    else {
                        front++;
                        queue_array[front] = ele;
                        System.out.println("Element added successfully");
                    }
                    break;
                case "dequeue":
                    if(front == -1) {
                        System.out.println("Queue is empty");

                    }
                    else {
                        int e = queue_array[front];
                        front--;
                        System.out.println("element " + e +  " popped successfully");
                    }
                    break;
                case "display":
                    if(front == -1) {
                        System.out.println("No element is there in the queue");

                    }
                    else {
                        for (int i = 0; i <= front; i++) {
                            System.out.print(queue_array[i] + " ");
                        }
                        System.out.println();
                    }
                        break;
                    case "exit":
                        exit = 1;
                        break;
                case "default":
                    System.out.println("Enter the correct choice");
                    break;
                    }
            }
        System.out.println(front + " " + rear);
        }
    }

