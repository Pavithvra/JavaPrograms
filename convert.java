import java.util.Scanner;

public class convert {
    public static int min(int a,int b,int c){
        if(a<=b&& a<=c){
            return a;
        }
        else {
            return c;
        }
    }
    public static int findMinSteps(String str1, String str2){
        int m =str1.length();
        int n =str2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for (int j=0;j<=n;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                else if(j==0){
                    dp[i][j]=i;
                }
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else {
                    dp[i][j] = 1+min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st String :");
        String str1 = sc.nextLine();
        System.out.print("Enter the 2nd string :");
        String str2 = sc.nextLine();
        int minstep = findMinSteps(str1,str2);
        System.out.print(minstep);
    }
}
