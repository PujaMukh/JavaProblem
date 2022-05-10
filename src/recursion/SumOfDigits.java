package recursion;
//find sum of digits of a no using recursion. eg 46=4+6=10
import java.lang.*;
import java.util.*;

public class SumOfDigits {
    static int sumDigits(int A) {
        //recursion=base condition(when to stop and return)+logic
        if (A==0) {
            return 0;   //base condition
        }
        return A%10+sumDigits(A/10);
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.println(sumDigits(A));
    }
}
