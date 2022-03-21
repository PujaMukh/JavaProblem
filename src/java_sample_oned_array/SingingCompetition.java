package java_sample_oned_array;
//2 sisters problem. 2 sisters avoid singing together because when they do, their singing sounds awful.
//find the time they are singing together.
//sister 1 starts at A1 and ends at A2, and  sister 2 starts at B1 and ends at B2.
//A1 always <A2 and B1 always less than B2

import java.lang.*;
import java.util.*;
public class SingingCompetition {
    static int twoSisters(int A1, int A2, int B1, int B2) {
        if ((A1<B1 && A2<B1 && A2<B2) || (B1<A1 && B2<A1 && B2<A2)) {
            return 0;
        }
        else if (A1<B1 && B2<A2) {
            return B2-B1;
        }
        else if (A1<A2 && A2<B2 && B1<A2 && A1<B1) {
            return A2-B1;
        }
        else if (A1<B2 && B1<A2 && B1<A1 && A2<B2) {
            return A2-A1;
        }
        else {
            return B2-A1;
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A1=sc.nextInt();
        int A2=sc.nextInt();
        int B1=sc.nextInt();
        int B2=sc.nextInt();
        System.out.print(twoSisters(A1, A2, B1, B2));
    }
}
