package kpitutorial;

import java.util.Stack;

public class StackTest {
    public static void main(String args[]) {
        Stack s = new Stack();
        String[] arr01 = {"aa", "bb", "cc"};
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("kpi test");
        s.push(arr01);
        System.out.println("peek only - no removal from stack=" + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println("is stack empty? " + s.empty());
        System.out.println("stack size= " + s.size());
//        System.out.println(s.pop());

    }
}
