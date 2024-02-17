import java.util.Scanner;

public class CountPairAverage {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++ ){
            arr[i] = sc.nextInt();
        }
        int avg =0;
        int count =0;
        for(int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                avg = (arr[i]+arr[j])/2;
            }
            for(int j =0;j<n;j++){
                if(avg ==arr[j]){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
