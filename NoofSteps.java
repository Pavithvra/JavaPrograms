import java.util.*;

public class NoofSteps {
    static int step(int[] arr,int n){
        int count=0;
        for(int i =0;i<n;){
            i+=arr[i];
            count++;
            if(i==n-1){
                break;
            }
            else if(i>n-1){

            }

        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:" );
        int n = sc.nextInt();
        int arr[] =new int[n];
        for (int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(step(arr,n));
    }
}
