package recursion;
import java.lang.*;
import java.util.*;

//print all nos from N to 1 using recursion
public class PrintNosNTo1 {
    static void printNos(int N) {
        if (N==1) {
            System.out.print(1+" ");
            return;
        }
        System.out.print(N+" ");
        printNos(N-1);
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        printNos(N);
    }

}
