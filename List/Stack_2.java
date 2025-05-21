package List;

import java.util.Scanner;
import java.util.Stack;
 
public class Stack_2 {
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
 
        try {
            System.out.println("Enter something to push:");
            int a = sc.nextInt();
            sc.nextLine(); 
            s.push(a);
 
            System.out.println("Do you want to pop? Type yes or no:");
            String b = sc.nextLine();
 
            if (b.equals("yes")) {
                if (!s.isEmpty()) {
                    s.pop();
                    System.out.println("Element popped.");
                } else {
                    System.out.println("Stack is empty.");
                }
            } else {
                System.out.println("Top element is: " + s.peek());
            }
 
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}

