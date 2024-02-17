import java.util.*;
public class ChangeShopkeeper {
    static String change(int arr[]){
        int c30=0, c60=0, c120 =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==30) {
                c30 += 1;
            }
            else if(arr[i]==60){
                if(c30<1){
                    return "Transaction Failed";
                }
                else{
                    c30-=1;
                    c30+=1;
                }
            }
            else if (arr[i]==120) {
                if(c30>=3){
                    c30-=3;
                    c120+=1;
                }
                else if (c30>=1 && c60>=1) {
                    c30-=1;
                    c60-=1;
                    c120+=1;
                }
                else {
                    return "Transaction Failed";
                }
            }
        }
        return "Transaction Successful";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of customers = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(change(arr));
    }
}
