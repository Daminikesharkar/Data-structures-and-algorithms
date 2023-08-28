package Hashing;
import java.util.Arrays;
import java.util.Scanner;
public class CountFrequency {
    public static void countFrequency(int[] arr,int n){

        int[] visited = new int[n];
        Arrays.fill(visited,0);

        for(int i=0;i<n;i++){
            if(visited[i] == 1) {
                continue;
            }
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    visited[j] = 1;
                    count++;
                }
            }
            System.out.println("Array element "+arr[i]+" appears "+count+" times");
        }
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
        countFrequency(arr,n);
    }
}
