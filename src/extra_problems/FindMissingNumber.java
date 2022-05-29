package extra_problems;

import java.util.Scanner;

//given an array of integers from 1 to N, find the missing number. There are no duplicates
public class FindMissingNumber {
    static int findMissing(int[]A) {
        int max=0;
        int sum=0;
        for (int i=0; i<A.length; i++) {
            sum=sum+A[i];
            if (A[i]>max) {
                max=A[i];
            }
        }
        return (max*(max+1)/2)-sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(findMissing(A));

    }
}
