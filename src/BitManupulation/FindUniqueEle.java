package BitManupulation;

import java.util.Scanner;

//given an array, every ele repeats twice except 1. Find the unique ele whose freq is 1
public class FindUniqueEle {
    static int findUnique(int[] A) {
        int ans=0;
        for (int i=0; i<A.length; i++) {
            ans=ans^A[i];
        }
        return ans;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(findUnique(A));
    }

}
