package ModularArithmatic;
//convert to excel column number
//eg. AB will be 28

import java.lang.*;
import java.util.*;

public class ExcelColumnNumber {
    static int excelColumnNumber(String A) {
        int N=A.length();
        int sum=0;

        for (int i=0; i<N; i++) {
            //convert to a number from left to right
            sum=sum*26+(A.charAt(i)-'A'+1);
        }
        return sum;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String A=sc.next();
        System.out.println(excelColumnNumber(A));
    }
}
//TC is O(N), SC is O(1)
