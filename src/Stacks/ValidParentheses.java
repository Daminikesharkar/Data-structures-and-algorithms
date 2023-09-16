package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses {
    Stack<Character> stack;
    int top = 0;
    public ValidParentheses() {
        stack = new Stack<>();
    }
    public boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                if((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '[' && s.charAt(i) == ']') ||
                        (stack.peek() == '{' && s.charAt(i) == '}')){
                        stack.pop();
                }else{
                    return false;
                }
            }
        }
        return (stack.size() == 0);
    }
    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parentheses: ");
        String s = sc.nextLine();

        System.out.println(v.check(s));
    }
}