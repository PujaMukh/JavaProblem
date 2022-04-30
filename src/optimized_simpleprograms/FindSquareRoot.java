package optimized_simpleprograms;
//given a perfect square, find the sq root

import java.lang.*;
import java.util.*;

public class FindSquareRoot {
    static long sqRoot(long A) {
        long left=1; //left is 1
        long right=A/2;
        long mid=0;

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
            if ((right-left==1 && right*right!=A )|| (right-left==1 && left*left!=A)) {
                return -1; //to prevent infinite loop
            }
        }
        else if (mid*mid<A){
            left=mid;
            if ((right-left==1 && right*right!=A )|| (right-left==1 && left*left!=A)) {
                return -1; //to prevent infinite loop
            }
        }
    }
    return mid;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong();
        System.out.print(sqRoot(A));
    }

}
//TC is O(log n), SC is O(1)
