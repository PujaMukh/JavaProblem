package LeetcodeProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//leetcode 179-given an array, find the largest number possible and return it in a string
public class FindLargest {
    static String largest(int[]A) {
        if (A.length==0) {
            return ""; //edge case-empty string
        }
        String[] S=new String[A.length];
        for (int i=0; i<A.length; i++) {   //convert to string and store in string array
            S[i]=Integer.toString(A[i]);
        }

        Arrays.sort(S, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String o1=a+b;
                String o2=b+a;
                return o2.compareTo(o1);

            }
        });

        if (S[0].equals("0")) {
            return "0";   //edge case no.2- all 0's even after sorting
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<S.length; i++) {
            sb.append(S[i]);
        }
        return sb.toString();
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        String S=largest(A);
        System.out.print(S);

    }
}
//TC is O(nlogn), SC is O(N)