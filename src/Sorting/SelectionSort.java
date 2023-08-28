package Sorting;
import java.util.Scanner;
public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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

        arr = selectionSort(arr);

        System.out.println();
        System.out.println("Array after sorting");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
