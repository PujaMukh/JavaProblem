package java_very_simpleproblems;
//calculate profit or loss

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
