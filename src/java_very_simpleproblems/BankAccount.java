package java_very_simpleproblems;
//You are given a Bank account having N amount and you are asked to perfrom ADD(credit)
// and SUBTRACT(debit) operations.
//After each operation print the amount left in the Bank account. If the debit amount is greater
// than current balance print "Insufficient Funds"(without quotes)
// and the operation is skipped.
//Input Format
//First line contains a single integer N denoting the balance in bank account.
//Second line contains a single integer M denoting the number of operations.
//Each of next M lines contains two space separated integers Type and Amount(X).
//If Type == 1, Perform ADD operation.
//If Type == 2, Perform SUBTRACT operation.//Output Format
//Print Amount in the bank balance after each operation on a new line.
//Example Input
//1000
//3
//1 500
//2 1400
//2 500
//Example Output
//1500
//100
//Insufficient Funds

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
