package BasicRecurssion;
import java.util.Scanner;
public class ReverseArray {
    public static void reverse(int[] arr,int s,int e){
        if(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            reverse(arr,s+1,e-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before reverse operation");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        reverse(arr,0,arr.length-1);

        System.out.println();
        System.out.println("Array after reverse operation");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
