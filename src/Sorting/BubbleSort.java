package Sorting;
import java.util.Scanner;
public class BubbleSort {
    public static int[] bubbleSort(int[] arr,int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
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

        System.out.println("Array before sorting");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        arr = bubbleSort(arr,n);

        System.out.println();
        System.out.println("Array after sorting");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
