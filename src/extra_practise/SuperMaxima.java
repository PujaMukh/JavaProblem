package extra_practise;
//print count of super maxima in an array
//An element is super maxima if there exist atleast one element before it and atleast one element
// after it and following conditions are satisfied:

import java.util.Scanner;

//  A[i-1] < A[i] > A[i+1]
       // A[i-1] + A[i+1] < A[i]
//eg:
// 2 3 1 4 2= ans =1 coz of 4
public class SuperMaxima {
    static int findSuperMaxima(int[] A) {
        int count=0;
        for (int i=1; i<A.length-1; i++) {
            if ((A[i-1]<A[i]) && (A[i]>A[i+1])) {
                if ((A[i-1]+A[i+1])<A[i]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }

        System.out.println(findSuperMaxima(A));


    }
}
