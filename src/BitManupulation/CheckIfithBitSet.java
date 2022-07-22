package BitManupulation;

import java.util.Scanner;

//given a number N and i, check if ith bit is set
public class CheckIfithBitSet {
    static boolean checkIf(int i, int A) {
        //eg 1010, 2nd bit is unset
        if (((A>>i)&1)==1) {
            return true;
        }
        return false;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int A=sc.nextInt();
        System.out.println(checkIf(i,A));
    }

}
//TC is O(1), SC is O(1)