package java_very_simpleproblems;
import java.lang.*;
import java.util.*;
public class Practise {
    static int solve(int A) {
        long left=1;
        long right=A/2;
        long mid=0;

        //edge case
        if (A==1 || A==4) {
            return 1;
        }

        while (left<right) {

            mid=left+ (right-left)/2;

            if (mid*mid==A) {
                return 1;
            }

            else if (mid*mid>A) {
                right=mid;
                if ((right-left==1 && left*left!=A) || (right-left==1)&& (right*right)!=A) {
                    return 0; //to break out of infinite loop
                }

            }
            else if (mid*mid<A) {
                left=mid;
                if ((right-left==1 && left*left!=A) || (right-left==1)&& (right*right)!=A) {
                    return 0; //to break out of infinite loop
                }

            }

        }
        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input for size of array
        System.out.println(solve(A));

    }
}
