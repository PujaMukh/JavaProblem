package prefix_sum;

import java.util.Scanner;

//find sum of range in given query
public class SumInGivenQuery {
    static int findSumOfRange(int[] A,int s,int e) {
        //eg. 3 2 -1 5 6 8 2 3 query 3 to 7, ans=pfsum[7]-pfsum[2]
        int[] pfsum=new int[A.length];
        pfsum[0]=A[0];
        for (int i=1; i<A.length; i++) {
            pfsum[i]=pfsum[i-1]+A[i];
        }
        if (s!=0) {
            return pfsum[e]-pfsum[s-1];
        }
        return pfsum[e];

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size
        int[]A=new int[N]; //declare A array
        for (int i=0; i<N; i++) { //take input for A array
            A[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        int e=sc.nextInt();
        System.out.println(findSumOfRange(A,s,e));
    }
}
