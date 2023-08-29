package MapAndSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class LuckyInteger {
    public static int luckyInteger(int[] arr,int n){
        int res = -1;
        HashMap<Integer,Integer> frequency = new HashMap<>();

        for(int i=0;i<n;i++){
            int count = 1;
            if(frequency.containsKey(arr[i])){
                count = frequency.get(arr[i])+1;
                frequency.put(arr[i],count);
            }else {
                frequency.put(arr[i], count);
            }
        }
        for(Map.Entry<Integer,Integer> m: frequency.entrySet()){
            if(m.getValue() == m.getKey()){
                res = m.getValue();
            }
        }
        return res;
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
        System.out.println("Lucky integer is "+luckyInteger(arr,n));
    }
}
