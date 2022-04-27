package BitManupulation;
//given n and i, set ith bit in n

import java.lang.*;
import java.util.*;
public class SetIthBitInN {
    static int setBit(int n, int i) {

        return (n | (1<<i));
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(setBit(n, i));
    }

}
//TC is O(1), SC is O(1)
