package java_very_simpleproblems;
//add or subtract in a bank account balance and return the remaining

import java.lang.*;
import java.util.*;
public class BankAccount {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //balance in account
        int M=sc.nextInt(); //number of operations


        for (int i=0; i<M; i++) {
            int type=sc.nextInt();
            int X=sc.nextInt(); //amount

            if (type==1) {
                N=N+X;
                System.out.println(N);

            }
            else if (type==2) {
                if (N<X) {
                    N=N-X;
                    System.out.println("Insufficient Funds");
                }
                else {
                    N=N-X;
                    System.out.println(N);
                }
            }
        }

    }
}
