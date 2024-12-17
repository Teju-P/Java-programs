package LC;

import java.util.Stack;

/*Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true */

public class ValidParanthesis {
    public static boolean isValid(String s) {
        boolean isValid = true;
        char[] c = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        for(int i =0; i<c.length;i++){
            if(c[i]=='(') stk.push('(');
            else if(c[i]=='[') stk.push('[');
            else if(c[i]=='{') stk.push('{');
            else if(c[i]==')'){
                if(!stk.isEmpty()){
                    if(stk.peek()=='(') stk.pop();
                    else return false;
                }
                else return false;
            }
            else if(c[i]==']'){
                if(!stk.isEmpty()){
                    if(stk.peek()=='[') stk.pop();
                    else return false;
                }
                else return false;
            }
            else if(c[i]=='}'){
                if(!stk.isEmpty()){
                    if(stk.peek()=='{') stk.pop();
                    else return false;
                }
                else return false;
            }
        }
        if(stk.isEmpty()) return isValid;
        else return false;
    }

    public static void main(String[] args) {
        String input = "(])";
        System.out.println("Is "+input+" valied? - "+isValid(input));
    }
}
