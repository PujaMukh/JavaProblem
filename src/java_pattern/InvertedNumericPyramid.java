package java_pattern;
//print this:
//1 2 3 4
//1 2 3
//1 2
//1
import java.lang.*;
import java.util.*;
public class InvertedNumericPyramid {
    static void invertedPyramid(int N) {
        for (int i=N; i>0; i--) { //outer row
            int val=1;
            for (int j=1; j<=i; j++) { //each row what is happening
                System.out.print(val+" ");
                val=val+1;
            }
            System.out.println();
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        invertedPyramid(N);
    }
}
