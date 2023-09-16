package Stacks;
import java.util.Stack;
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int data){
        stack.push(data);
        if (minStack.isEmpty() || data <= minStack.peek()){
            minStack.push(data);
        }
    }
    public void pop(){
        if(stack.peek() == minStack.peek()){
            minStack.pop();
        }
        stack.pop();
    }
    public int getMin(){
        return minStack.peek();
    }
    public int top(){
        return stack.peek();
    }
    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(-2);
        m.push(0);
        m.push(-3);
        System.out.println("Stack is: "+m.stack);
        System.out.println("Minimum ele: "+m.getMin());

        m.pop();
        System.out.println("Stack after one pop: "+m.stack);

        System.out.println("Stack top is: "+m.top());
        System.out.println("Minimum ele is: "+m.getMin());
    }
}