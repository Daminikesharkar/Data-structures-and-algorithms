package Sorting;

import java.util.ArrayList;
import java.util.Scanner;
public class MergeSort {
    public static void merge(int[] arr,int s, int e){
        int mid = (s+e)/2;
        int left = s;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=e){

            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=e){
            temp.add(arr[right]);
            right++;
        }
        for(int i=s;i<=e;i++){
            arr[i] = temp.get(i-s);
        }
    }
    public static void mergeSort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,e);
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

        mergeSort(arr,0,arr.length-1);

        System.out.println();
        System.out.println("Array after sorting");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
