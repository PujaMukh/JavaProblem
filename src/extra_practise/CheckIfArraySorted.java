package extra_practise;

import java.util.Scanner;

//check if given array is sorted
public class CheckIfArraySorted {
    static boolean checkIf(int[] A) {
        for (int i=0; i<A.length-1; i++) {
            if (A[i]>A[i+1]) {
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(checkIf(A));


    }
}
