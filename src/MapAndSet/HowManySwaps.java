package MapAndSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class HowManySwaps {
    public static int howManySwaps(int[] arr,int n){
        int count =0;
        int[] temp = new int[n];
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);

        for(int i=0;i<n;i++){
            hm.put(arr[i],i);
        }

        for(int i=0;i<n;i++){
            if(arr[i] != temp[i]){
                count++;
                int t = arr[hm.get(temp[i])];
                arr[hm.get(temp[i])] = arr[i];
                arr[i] = t;
            }
        }
        return count;
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
        System.out.println("Minimum swaps require to sort the array is "+howManySwaps(arr,n));
    }
}
