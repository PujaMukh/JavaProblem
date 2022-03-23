package Optimized_simplePrograms;
//find if the given integer is a prime number
import java.lang.*;
import java.util.*;
public class FindIfprime {
    static int primeNumber(int A) {
        int count=0;
        for (int i=1; i*i<=A; i++) { //find i and A/i
            if (i==A/i) {
                count++;  //if in any case, number is same, increase count by 1
            }
            else if (A%i==0) {
                count=count+2; //else since we are doing i and A/i (both are factors), increase c by 2
            }
        }
        if (count==2) {
            return 1;
        }

        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(primeNumber(A));
    }
}
