package prefix_sum;

import java.lang.*;
import java.util.*;

//find the equilibrium index in an array if there is any
public class FindEquilibriumIndex {
        static int equilibrium(int[]A) {
            //we have to check each index if that is equilibrium index
            int count=0;
            int N=A.length; //size of given array
            //1st construct prefix array of size N
            int[]sum=new int[N];

            sum[0]=A[0]; //edge case
            for(int i=1; i<N; i++) {
                sum[i]=sum[i-1]+A[i];
            }


            //left=0 to i-1=sum(i-1) where sum is the name of prefix array
            //right=i+1 to N-1=sum(N-1)-sum(i)

            for (int i=0; i<N; i++) { //now loop and check for every index
                int left=0;
                int right=0;
                if (i==0) {
                    left=0;
                    right=sum[N-1]-sum[i];
                }
                else {
                    left=sum[i-1];
                    right=sum[N-1]-sum[i];
                }
                if (left==right) {
                    return i;
                }

            }
            return -1;
        }
        public static void main(String args[])   {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int[]A=new int[N];
            for (int i=0; i<N; i++) {
                A[i]=sc.nextInt();
            }
            System.out.print(equilibrium(A));
        }
    }
//TC is O(N) and SC is O(N) as we are creating prefix array

