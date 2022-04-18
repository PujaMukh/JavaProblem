package BitManupulation;
//take an int and return the number of 1 bits it has

import java.lang.*;
import java.util.*;
public class NumberOfBits {
    static int findNumberOfOneBits(int A) {
        int count=0;

        while (A>0) {
            if (A%2==1) {
                count++;
            }
            A=A/2;
        }
        return count;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input for size of array

        System.out.println(findNumberOfOneBits(A));
    }

}
//TC is O(log n), SC is O(1)