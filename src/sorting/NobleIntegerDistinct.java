package sorting;
//calculate number of noble integer where data is distinct
//noble if no of elements<A[i]=A[i]

import java.lang.*;
import java.util.*;
public class NobleIntegerDistinct {
    static int findNumberOfNobleInteger(int[]A) {
        int N=A.length;
        Arrays.sort(A);
        int count=0;

        for (int i=0; i<N; i++) {
            if (i==A[i]) {
                count++;
            }
        }
        return count;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(findNumberOfNobleInteger(A));
    }
}
//TC is O(nlogn), SC is O(1)