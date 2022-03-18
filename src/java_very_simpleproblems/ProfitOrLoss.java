package java_very_simpleproblems;
//You are given the Cost Price C and Selling Price S of a Product.
// You have to tell whether there is a Profit or Loss(return 1 or -1)
// Also, calculate total profit or loss.

import java.lang.*;
import java.util.*;
public class ProfitOrLoss {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int C=sc.nextInt();
        int S= sc.nextInt();

        if (C<S) {
            int profit=S-C;
            System.out.println("1"+" "+profit);
        }
        else {
            int loss=C-S;
            System.out.println("-1"+" "+loss);
        }
    }
}
