package extra_practise;

import java.util.Scanner;

//print all perfect nos which lie in the range of 1 to A
//Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//A proper divisor of a natural number is the divisor that is strictly less than the number
public class PrintPerfectNos {
    //eg i/p 8, o/p=6
    static void printNos(int A) {
        int i=1;
        int sum=0;
        while (i<=A) { //perfect nos in range 1 to A (A==8)
            //while (6<=8)
            //find proper divisor
            sum=0;
            for (int j=1; j<i; j++) { //j=1, j<6; j++
                if (i%j==0) {
                    sum=sum+j;
                }
            }
            if (sum==i) {
                System.out.println(sum);
            }
            i++;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        printNos(A);


    }
}
