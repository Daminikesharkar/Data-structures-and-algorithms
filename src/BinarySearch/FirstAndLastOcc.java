package BinarySearch;
import java.util.Scanner;
public class FirstAndLastOcc {
    public static int[] firstAndLastOccOfEle(int[] arr,int n,int target){
        int[] ans = {-1,-1};
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                ans[0] = mid;
                end = mid-1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }

        start = 0;
        end = n-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                ans[1] = mid;
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
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

        System.out.println("Starting and ending index of target "+target+" is");
        int[] ans = firstAndLastOccOfEle(arr,n,target);
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
