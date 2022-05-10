package recursion;
import java.lang.*;
import java.util.*;
//find factorial of N using recursion
//fact of 5=5*4*3*2*1
public class FactOfN {
    static int findFactRecursion(int N) {
        if (N==1) {
            return 1;
        }
        return N*findFactRecursion(N-1);
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        System.out.println(findFactRecursion(N));
    }
}
