package java_simpleprograms;
//find the Ath fibonacci term when A is given

import java.lang.*;
import java.util.*;
public class FindAthFibonacci {
    //1st I will create an arraylist with 1st 3 elements in fibonaaci and keep adding in loop
    static int nthFibonacci(int A) {
        ArrayList<Integer>C=new ArrayList<Integer>();
       C.add(0);
       C.add(1);
       C.add(1);

       int sum1=1; //initialize sum1 and sum2
       int sum2=1;

       int i=3;
       while (i<=A) { //run only till A and keep adding the values in C
           int temp=sum1;
           sum1=sum1+sum2;
           C.add(sum1);
           sum2=temp;
           i++;
       }

       return C.get(A);
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input for A
        System.out.print(nthFibonacci(A));
    }
}
//TC is O(N) and SC is O(N)