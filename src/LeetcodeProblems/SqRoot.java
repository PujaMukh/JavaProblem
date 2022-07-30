package LeetcodeProblems;
//leetcode no 69
//find sq root of a number and return its integer part
//eg for 8, ans =2
//doing it using binary search
public class SqRoot {
    public static int mySqrt(int x) {

        if (x==1 || x==2 || x==3) {
            return (int)1;
        }
        else if (x==4) {
            return (int)2;
        }

        long left=1; //left=1
        long right=x/2; //right=2
        long mid=0;



        while (left<right) {

            mid=left+(right-left)/2; //mid=1

            if (mid*mid==x) {
                return (int) mid;
            }

            else if (mid*mid>x) {
                right=mid;

                if ((mid*mid<x) && ((mid+1)*(mid+1)>x)) {
                    return (int)mid;
                }

                if ((right-left==1 && right*right!=x )|| (right-left==1 && left*left!=x)) {
                    return (int) right;
                }


            }


            else if (mid*mid<x) {
                left=mid;  //left=1

                if ((mid*mid<x) && ((mid+1)*(mid+1)>x)) {
                    return (int)mid;
                }

                if ((right-left==1 && right*right!=x )|| (right-left==1 && left*left!=x)) {
                    return (int) right;
                }

            }
        }
        return (int)mid;

    }
}
