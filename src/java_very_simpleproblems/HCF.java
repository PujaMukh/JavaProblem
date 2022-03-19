package java_very_simpleproblems;
//find hcf of 2 numbers
import java.lang.*;
import java.util.*;
public class HCF {
    static int findHCF(int A, int B) {
        //1st find max of A and B
        int max=0;
        int min=0;
        if (A>B) {
            max=A;
            min=B;
        }
        else {
            max=B;
            min=A;
        }
        //then find 1st mod
        int c=max%min;
        if (c==0) {
            return min;
        }
        else {
            while (c>0) {
                max=min;
                min=c;
                c=max%min;
            }
        }
        return min;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.print(findHCF(A,B));
    }
}
