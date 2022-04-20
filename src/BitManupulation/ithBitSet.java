package BitManupulation;
//given an array N and i, check if ith bit is set or not in O(1) TC
//1st using right shift

import java.lang.*;
import java.util.*;

public class ithBitSet {
    static boolean checkIfIthBitSet(int n, int i) {
        n=n>>i;
        if ((1 & n)==1) {
            return true;
        }
        return false;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //take input for size of array
        int i=sc.nextInt();
        System.out.println(checkIfIthBitSet(n,i));
    }

}
//TC is O(1), SC is O(1)
