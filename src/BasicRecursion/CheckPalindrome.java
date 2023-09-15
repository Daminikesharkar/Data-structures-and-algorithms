package BasicRecurssion;

public class CheckPalindrome {
    public static boolean palindrom(String str,int s,int e){
        if(s<e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            palindrom(str,s+1,e-1);
        }
        return  true;
    }
    public static void main(String[] args) {
        System.out.println(palindrom("abccba",0,5));
    }
}
