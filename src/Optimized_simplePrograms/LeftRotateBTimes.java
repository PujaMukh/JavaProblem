package Optimized_simplePrograms;
//given an array A and an array B containing number of times array A has to be left rotated,
//return a matrix containing the result after left rotations each time
//eg. A= 1 2 3 4 5, B=2 3, o/p= {3 4 5 1 2
   //                            4 5 1 2 3}

import java.lang.*;
import java.util.*;
public class LeftRotateBTimes {
    static void rotate(int[]A, int[]B) {
        int N=A.length;
        int M=B.length;
        //we have to preserve the array A for the other loops to run
        //so store it in another array named C
        int[]C=new int [N]; //make a temporary array C so that array A is preserved


        for (int j=0; j<M; j++) { //iterating though length of array B

            for (int i=0; i<N; i++) { //everytime putting all elements in A to C and playing with C
                C[i]=A[i];
            }

            if (B[j]%N==0) {
                for (int p=0;p<N;p++) {
                    System.out.print(C[p]+" ");
                }
                System.out.println();
            }

            else {
                for (int i=0; i<B[j]%N; i++) {
                    int temp=C[0];
                    //loop to shift elements to left
                    for (int k=0; k<=N-2; k++) {
                        C[k]=C[k+1];
                    }
                    C[N-1]=temp;

                }
            }
            for (int p=0; p<N; p++) {
                System.out.print(C[p]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }

        int M=sc.nextInt();
        int[]B=new int[M];
        for (int i=0; i<M; i++) {
            B[i]=sc.nextInt();
        }
        rotate(A,B);
    }
}
