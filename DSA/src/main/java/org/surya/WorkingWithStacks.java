package org.surya;

import java.util.Stack;

public class WorkingWithStacks {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(13);
        stack.push(15);

        System.out.println(stack.peek());

        System.out.println(stack.size());

        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.peek());

    }

}
