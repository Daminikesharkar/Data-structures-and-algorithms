package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class RemoveAdjDuplicated {
    Stack<Character> stack;
    public RemoveAdjDuplicated() {
        stack = new Stack<>();
    }
    public StringBuilder remove(String s){

        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }

        return ans.reverse();
    }
    public static void main(String[] args) {
        RemoveAdjDuplicated r = new RemoveAdjDuplicated();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();

        System.out.println("String after removing adjacent duplicates: "+r.remove(s));
    }
}