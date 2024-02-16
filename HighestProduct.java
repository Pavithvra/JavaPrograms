import java.util.*;

public class HighestProduct {

    static int sum(int n){
        int sum =0;
        int max =1;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                sum+=i;
                if(sum<n){
                    ;
                }
                if(sum==n){
                    max*=i;
                } else if (sum>n) {
                    sum=0;
                }
            }
        }
        return max;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n :");
        int n = sc.nextInt();
        System.out.print(n);
    }
}
