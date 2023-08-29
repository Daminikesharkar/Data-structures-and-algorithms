package Hashing;
import java.util.Arrays;
import java.util.Scanner;
public class CountPrimes {
    public static int countPrimes(int n){
        int count = 0;
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        for(int i=2;i<n;i++){
            if(arr[i] == 1){
                count++;
            }
            for(int j=i+i;j<n;j = j+i){
                arr[j] = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer n");
        int n = sc.nextInt();

        System.out.println("Total primes which are less than"+" "+n+" = "+countPrimes(n));
    }
}