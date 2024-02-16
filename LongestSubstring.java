import java.util.*;

public class LongestSubstring {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n =str.length();
        int l = 0, r = 0;
        HashSet<Character> set = new HashSet<>();
        int maxstr =0;
        int maxr = 0, maxl = 0;
        while (r<n){
            if(!set.contains(str.charAt(r))){
                set.add(str.charAt(r));
                if(r-l+1>maxstr){
                    maxstr = r-l+1;
                    maxl = l;
                    maxr = r;
                }
                r++;
            }
            else {
                set.remove(str.charAt(l));
                l++;
            }
        }
        for (int i = maxl ;i<=maxr;i++){
            System.out.print(str.charAt(i));
        }
    }
}
