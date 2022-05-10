package recursion;
import java.lang.*;
import java.util.*;

//find sum of n natural nos using recursion
public class SumOfNNaturalNos {
    static int findSum(int N) {
        if (N==1) {
            return 1;
        }
        return N+findSum(N-1);
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(findSum(N));
    }
}
