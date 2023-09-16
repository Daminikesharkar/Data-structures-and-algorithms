package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class StackSequenceValidation {
    Stack<Integer> stack ;
    public StackSequenceValidation() {
        stack = new Stack<>();
    }
    public boolean check(int[] pushed,int[] popped){

        int j=0;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);

            while(!stack.isEmpty() && j<popped.length && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        StackSequenceValidation s =new StackSequenceValidation();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array(pushed)");
        int n = sc.nextInt();

        int[] pushed = new int[n];
        System.out.println("Enter elements of array(pushed)");
        for(int i=0;i<n;i++){
            pushed[i] = sc.nextInt();
        }

        System.out.println("Enter length of array(popped)");
        int m = sc.nextInt();

        int[] popped = new int[m];
        System.out.println("Enter elements of array(popped)");
        for(int i=0;i<m;i++){
            popped[i] = sc.nextInt();
        }

        System.out.println("pushed: ");
        for (int i=0;i<n;i++){
            System.out.print(pushed[i]+" ");
        }

        System.out.println("popped: ");
        for (int i=0;i<m;i++){
            System.out.print(popped[i]+" ");
        }
        System.out.println();
        System.out.println("is sequence valid?: "+s.check(pushed,popped));
    }
}