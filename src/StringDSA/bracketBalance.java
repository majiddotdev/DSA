package StringDSA;

import java.util.Stack;

public class bracketBalance {
    public static void main(String[] args) {
        String s = "(({[]}))";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    System.out.println("the give string is not balance bracket");
                    return;
                } else if (st.peek() == '(' && ch == ')' || st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']') {
                    st.pop();
                } else {
                    System.out.println("the give string is not balance bracket");
                    return;
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("the give string is balance bracket");
        } else {
            System.out.println("the give string is not balance bracket");
        }
    }
}
