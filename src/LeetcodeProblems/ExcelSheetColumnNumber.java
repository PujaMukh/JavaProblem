package LeetcodeProblems;
//leetcode 171
//convert AB to 28

import java.lang.*;
import java.util.*;
public class ExcelSheetColumnNumber {
    static int excelSheet(String A) {
        int N=A.length();
        int sum=0;

        for (int i=0; i<N; i++) {
            sum=sum*26+A.charAt(i)-'A'+1;
        }
        return sum;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(excelSheet(A));

    }
}
//TC is O(N), SC is O(1)