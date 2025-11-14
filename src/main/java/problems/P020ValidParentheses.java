package problems;

import java.util.Stack;

public class P020ValidParentheses {
    public boolean isValid(String s) {
        if(s==null || s.length()%2!=0) return false;
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()) {
            switch (c) {
                case ')':
                    if(st.isEmpty() || st.pop()!='(') return false;
                    break;
                case '}':
                    if(st.isEmpty() || st.pop()!='{') return false;
                    break;
                case ']':
                    if(st.isEmpty() || st.pop()!='[') return false;
                    break;
                default:
                    st.push(c);
            }
        }
        return st.isEmpty();
    }
}
