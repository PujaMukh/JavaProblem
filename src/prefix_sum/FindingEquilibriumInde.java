package prefix_sum;
//return the 1st equilibrium index if we have more than 1
import java.util.Scanner;

public class FindingEquilibriumInde {
    public static int solve(int[] A) {
        //make pffront and pfback array
        int[] pffront=new int[A.length];
        pffront[0]=A[0];
        for (int i=1; i<A.length; i++) {
            pffront[i]=pffront[i-1]+A[i];
        }

        int[] pfback=new int[A.length];
        pfback[A.length-1]=A[A.length-1];
        for (int i=A.length-2; i>=0; i--) {
            pfback[i]=pfback[i+1]+A[i];
        }


        for (int i=0; i<A.length; i++) {
            if (i==0) {
                if (pfback[i+1]==0) {
                    return 0;
                }
            }

            else if (i>=1 && i<=A.length-2) {
                if (pffront[i-1]==pfback[i+1]) {
                    return i;
                }

            }
            else if (i==A.length-1){ //this one at end because we have to return 1st index
                if (pffront[i-1]==0) {
                    return A.length-1;
                }
            }


        }
        return -1;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size
        int[]A=new int[N]; //declare input array

        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all elements in array A
        }

        System.out.print(solve(A)); //print
    }
}
