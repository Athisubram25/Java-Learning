package List;

import java.util.Scanner;
import java.util.Stack;

public class Stack_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            stack.push(num);
        }

        System.out.println("Popped elements from stack:");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        sc.close();
    }
}

