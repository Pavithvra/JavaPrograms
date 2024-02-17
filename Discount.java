import java.util.Scanner;

public class Discount {
    static int divisor(int n , int m) {
        int count = 0;
        int temp = 0;
        int sum = 0;
        for (int x = n; x < m + 1; x++) {
            for (int i = 1; i <= x; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            for (int i = 1; i <= count / 2; i++) {
                if (count % 1 == 0) {
                    temp++;
                }
                if (temp >1) {

                } else {
                    sum++;
                }
            }
        }
            return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value :");
        int n = sc.nextInt();
        System.out.print("Enter the m value :");
        int m = sc.nextInt();
        System.out.print(divisor(n,m));
    }
}
