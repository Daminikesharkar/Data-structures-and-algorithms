package BinarySearch;
import java.util.Scanner;
public class Searching {
    public static int searchIndex(int[] arr,int n,int target){
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }else if(target<arr[mid]){
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
        System.out.println("Enter target ");
        int target = sc.nextInt();

        System.out.println("Element fount at index "+searchIndex(arr,n,target));
    }
}
