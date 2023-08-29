package MapAndSet;
import java.util.HashMap;
import java.util.Scanner;
public class TwoSum {
    public static int[] twoSum(int[] arr,int n,int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] out = new int[2];

        for(int i=0;i<n;i++){
            int a = arr[i];
            int b = target - a;
            if(hm.containsKey(b)){
                out[0] = hm.get(b);
                out[1] = i;
                break;
            }else{
                hm.put(a,i);
            }
        }
        return out;
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
        System.out.println("Enter Target");
        int target = sc.nextInt();

        int[] ans = twoSum(arr,n,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
