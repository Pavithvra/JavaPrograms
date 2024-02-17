import java.util.*;

public class FillBag {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n = sc.nextInt();
        System.out.print("Enter the Weights: ");
        int arr[] = new int [n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the max capacity :");
        int c = sc.nextInt();
        int sum =0;
        int count=0;
        for (int i =0 ;i<n;i++){
            sum+=arr[i];
            if(sum>=c){
                count +=1;
                sum= sum-c;
            }
        }
        if(sum>0){
            count+=1;
        }
        System.out.print(count);
    }
}

