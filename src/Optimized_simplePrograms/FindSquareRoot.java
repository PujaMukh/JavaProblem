package Optimized_simplePrograms;
//given a perfect square, find the sq root

import java.lang.*;
import java.util.*;

public class FindSquareRoot {
    static int sqRoot(int A) {
        int left=1; //left is 1
        int right=A/2;
        int mid=0;

        if (A==1) {
            return 1;
        }
        else if (A==4) {
            return 2;
        }

    while(left<right) {

        mid=left+(right-left)/2;

        if (mid*mid==A) {
            return mid;
        }
        else if (mid*mid>A) {
            right=mid;
        }
        else {
            left=mid;
        }
    }
    return mid;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(sqRoot(A));
    }

}
