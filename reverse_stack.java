package stack;

import java.util.Stack;
import java.util.Scanner;

public class reverse_stack {

    public static String ReverseString(String str) {
        Stack<Character> s = new Stack<>();  

        for (int idx = 0; idx < str.length(); idx++) {
            s.push(str.charAt(idx));
        }

        StringBuilder st = new StringBuilder("");

     
        while (!s.isEmpty()) {
            st.append(s.pop());
        }

        return st.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        System.out.println("Reversed string: " + ReverseString(str));
    }
}
