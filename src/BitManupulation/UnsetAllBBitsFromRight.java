package BitManupulation;
//given n and int B, unset all B bits from right and return the ans
//THIS IS LIKE A PATTERN PROBLEM
//CHECK THE FINAL RESULT AND YOU WILL FIND A PATTERN UsING BIT

import java.lang.*;
import java.util.*;
public class UnsetAllBBitsFromRight {
    static int unsetBits(int A, int B) {
        return (A>>B)<<B;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input for size of array
        int B=sc.nextInt();
        System.out.println(unsetBits(A,B));

    }
}
//TC is O(1), SC is O(1)
