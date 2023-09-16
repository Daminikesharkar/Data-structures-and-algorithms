package Stacks;
public class StackImplementation {
    int[] stack;
    int top;
    int capacity;
    public StackImplementation(int size) {
        stack = new int[size];
        top = -1;
        capacity = size;
    }
    public int getTop(){
        return top;
    }
    public void push(int ele){

        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = ele;
    }
    public int pop(){
        int ele = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else {
            ele = stack[top];
            top--;
        }
        return ele;
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(top == capacity-1){
            return true;
        }
        return false;
    }
    public void displayStack(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
    }

    public static void main(String[] args) {
            StackImplementation s = new StackImplementation(5);
            s.push(1);
            s.push(2);
            s.push(3);
            System.out.print("Stack is: ");
            s.displayStack();

            System.out.println();
            System.out.println("popped element:"+s.pop());
            s.push(4);

            System.out.print("Stack after popped operation: ");
            s.displayStack();
    }
}
