package java_simpleprograms;
//find the power of A^B

import java.lang.*;
import java.util.*;
public class FindPower {
    static int power(int A, int B) {
        //A will run B times for us to get the answer
        int pow=1;
        for (int i=1; i<=B; i++) {
            pow=pow*A;
        }
        return pow;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.print(power(A, B));
    }
}
