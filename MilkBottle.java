/*question 5 [TCS-2023]

Given N Rupees. A liter plastic bottle of milk costs R1 Rupees and a liter of the glass bottle of milk costs R2 Rupees.
But the empty glass bottle after buying can be exchanged for R3 Rupees. Find the maximum liters of milk which can be
bought with N Rupees.

Example-1:
Input:

10->Value of N
11→Value of R1 i.e. price of plastic bottle
9→Value of R2 I.e. price of glass bottle
8→Value of R3 i.e. price of empty glass bottle

Output:
2
*/



import java.util.*;
public class MilkBottle {
    static void milk(int budget,int plastic,int glass,int refund){
        if(glass-refund<plastic){
            int ans = Math.max(((budget-refund)/(glass-refund)),0);
            budget-=ans*(glass-refund);
            ans+=budget/plastic;
            System.out.println(ans);
        }
        else{
           System.out.println(budget/plastic);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount you have :");
        int budget = sc.nextInt();
        System.out.print("Enter the amount milk in plastic bottle :");
        int plastic = sc.nextInt();
        System.out.print("Enter the amount of milk in glass bottle :");
        int glass = sc.nextInt();
        System.out.print("Enter the amount for the empty glass bottle :");
        int refund = sc.nextInt();
        milk(budget,plastic,glass,refund);
    }
}
