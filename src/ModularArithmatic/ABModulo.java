package ModularArithmatic;
//given A, B, find the greatest possible +ve int such that A%M=B%M
//based on what we know number-greatest possible multiple less than the number=mod
//constraints A,B can go upto 10^9

import java.lang.*;
import java.util.*;
public class ABModulo {
    static int findABModulo(int A, int B) {
        if (A>B) {
            return A-B;
        }
        return B-A;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(findABModulo(A,B));

    }
}
//TC is O(1), SC is O(1)
