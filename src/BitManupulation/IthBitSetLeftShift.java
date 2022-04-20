package BitManupulation;
//now check if ith bit is set using leftshift

import java.lang.*;
import java.util.*;

public class IthBitSetLeftShift {
    static boolean ithBitSet(int n, int i) {
        if ((n & (1<<i))==(1<<i)) { //2^i=i<<i
            return true;
        }
        return false;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();

        System.out.println(ithBitSet(n,i));
    }
}
//TC is O(1), SC is O(1)
