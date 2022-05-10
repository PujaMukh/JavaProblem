package recursion;
import java.lang.*;
import java.util.*;
//calculate Nth fibonacci number using recursion
public class NthFibonacci {
    static int findFib(int N) {
        if ((N==1)|| (N==2)) {
            return 1;
        }
        else if (N==0) {
            return 0;
        }
        return findFib(N-1)+findFib(N-2);
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        System.out.println(findFib(N));
    }
}
