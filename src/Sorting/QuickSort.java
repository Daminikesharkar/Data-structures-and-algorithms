package Sorting;
import java.util.Scanner;
public class QuickSort {
    public static int partition(int[] arr,int s,int e){
        int pivot = arr[s];
        int count =0;

        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        count = s+count;

        int temp = arr[count];
        arr[count] = arr[s];
        arr[s] = temp;

        int i=s;
        int j=e;

        while(i<count && j>count){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<count && j>count){
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }
        }
        return count;
    }
    public static void qs(int[] arr,int s,int e){
        //base case
        if(s>=e){
            return;
        }

        //part the array
        int partIndex = partition(arr,s,e);

        //sorting left half
        qs(arr,s,partIndex-1);

        //sorting right half
        qs(arr,partIndex+1,e);
    }
    public static int[] quickSort(int[] arr){
        qs(arr,0,arr.length-1);
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

        arr = quickSort(arr);

        System.out.println();
        System.out.println("Array after sorting");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
