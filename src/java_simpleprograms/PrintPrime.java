package java_simpleprograms;
//print all prime numbers from 1 to N
import java.lang.*;
import java.util.*;
public class PrintPrime {
    static void printAllPrime(int N) {
        for (int i=2; i<=N; i++) { //loop for prime number
            int c=0;
            for (int j=1; j<=i; j++) { //loop to find factors for each i
                if (i%j==0) {
                    c++;
                }
            }
            if (c==2) {
                System.out.println(i);
            }

        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        printAllPrime(N);
    }

}
