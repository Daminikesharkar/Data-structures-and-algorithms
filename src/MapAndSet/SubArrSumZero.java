package MapAndSet;
import java.util.HashSet;
import java.util.Scanner;
public class SubArrSumZero {
    public static boolean subArrayWithSumZero(int[] arr,int n){
        boolean result = false;
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;

        for(int i=0;i<n;i++) {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
                return true;
            }
            hs.add(sum);
        }
        return result;
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
        System.out.println("Is array contains any subarray with sum zero?: "+subArrayWithSumZero(arr,n));
    }
}
