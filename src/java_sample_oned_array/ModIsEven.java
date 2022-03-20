package java_sample_oned_array;
//given an array of N integers and an integer B,check if A[i]%B is even. Return count

import java.lang.*;
import java.util.*;
public class ModIsEven {
    static int modEven(int[]A, int B) {
        int N=A.length; //length of array A
        int c=0;
        for (int i=0; i<N; i++) {
            int result=A[i]%B;
            if (result%2==0) {
                c++;
            }

        }
        return c;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int[]A=new int[N]; //declare blank array
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all elements of array A
        }
        int B=sc.nextInt(); //take input for B
        System.out.print(modEven(A,B));

    }
}
