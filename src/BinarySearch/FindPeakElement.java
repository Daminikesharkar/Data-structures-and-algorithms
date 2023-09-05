package BinarySearch;
import java.util.Scanner;
public class FindPeakElement {
    public static int findPeakElement(int[] arr,int n){
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[n-1]>arr[n-2]){
            return n-1;
        }
        int start = 1;
        int end = n-2;
        while(start<=end){
            int mid = (start + end)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid-1]>arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
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

        System.out.println("Index of Peak element is: "+findPeakElement(arr,n));
    }
}
