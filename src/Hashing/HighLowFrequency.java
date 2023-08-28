package Hashing;
import java.util.Arrays;
import java.util.Scanner;
public class HighLowFrequency {
    public static void highestAndLowestFreqEle(int[] arr,int n){
        int min = Integer.MAX_VALUE, min_ele = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, max_ele = Integer.MIN_VALUE;

        int[] visited = new int[n];
        Arrays.fill(visited,0);

        for(int i=0;i<n;i++){
            if(visited[i] == 1){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    visited[j] = 1;
                    count++;
                }
            }
            if(count > max){
                max_ele = arr[i];
                max = count;
            }
            if(count < min){
                min_ele = arr[i];
                min = count;
            }
        }
        System.out.println("Maximum frequency is of element "+max_ele+" which is "+max);
        System.out.println("Minimum frequency is of element "+min_ele+" which is "+min);
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
        highestAndLowestFreqEle(arr,n);
    }
}
