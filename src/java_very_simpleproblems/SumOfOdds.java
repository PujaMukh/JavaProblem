package java_very_simpleproblems;
//You are given a positive integer A. You have to print the sum of all odd numbers
// in the range [1, A].
import java.lang.*;
import java.util.*;
public class SumOfOdds {
    static int oddSum(int A) {
        int sum=0;
        for (int i=1; i<=A; i=i+2) {
            if (i%2!=0) {
                sum=sum+i;
            }

        }
        return sum;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(oddSum(A));
    }
}
