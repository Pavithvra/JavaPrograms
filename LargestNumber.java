import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        String strNum = Integer.toString(n);
        char arr[] =strNum.toCharArray();
        Arrays.sort(arr);
        String numrev ="";
        for (int i = arr.length-1 ;i>=0;i--){
            numrev +=arr[i];
        }
        System.out.print(numrev);
    }
}
