package MapAndSet;
import java.util.HashSet;
import java.util.Scanner;
public class JewelsAnsStones {

    public static int jewelsAndStones(String jewels,String stones){
        int count =0;
        HashSet<Character> hs = new HashSet<>();

        for(int i=0;i<jewels.length();i++){
            hs.add(jewels.charAt(i));
        }

        for(int i=0;i<stones.length();i++){
            if(hs.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter jewels string");
        String jewels = sc.nextLine();

        System.out.println("Enter stones string");
        String stones = sc.nextLine();

        System.out.println(jewelsAndStones(jewels,stones)+" stones are also jewels");
    }
}
