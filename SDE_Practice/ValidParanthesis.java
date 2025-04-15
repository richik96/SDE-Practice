package SDE_Practice;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {

        String s = "[{()}]";

        System.out.println(" The string is valid ? :" +isValid(s));
    }

    static boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '[' || ch == '{' || ch == '(') {
                s1.push(ch);
            }
            else {
                if(s1.isEmpty()) return false;
                char last = s1.pop();
                if((ch==')' && last!='(') || (ch=='}' && last!='{') || (ch==']' && last!='[')) {
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }
}
