package Optimized_simplePrograms;
//given a perfect square, find the sq root

import java.lang.*;
import java.util.*;

public class FindSquareRoot {
    static int sqRoot(int A) {
        int left=1; //left is 1
        int right=A/2; //half it
        int mid=left+(right-left)/2; //find the mid

        while(mid*mid>A) { //run loop until mid*mid>A
            left=1;
            right=mid;
            mid=left+(right-left)/2;
        }
        while (mid*mid<A) { //when the above loop breaks, eliminate the left side
            left=mid;
            mid=left+(right-left)/2;
        }
        return mid;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(sqRoot(A));
    }

}
