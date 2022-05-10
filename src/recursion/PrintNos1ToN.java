package recursion;
import java.lang.*;
import java.util.*;

//print all nos from 1 to N using recursion
public class PrintNos1ToN {
    static void printNos(int N) {
        if (N==1) {
            System.out.print(1+" ");
            return;
        }
        printNos(N-1);
        System.out.print(N+" ");
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        printNos(N);
    }
}
