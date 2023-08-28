package Sorting;
import java.util.Scanner;
public class InsertionSort {
    public static int[] insertionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
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

        arr = insertionSort(arr,n);

        System.out.println();
        System.out.println("Array after sorting");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
