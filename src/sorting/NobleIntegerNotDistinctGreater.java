package sorting;
//now return 1 if any noble integer exists such that number of integers GREATER THAN A[i]=A[i]

import java.lang.*;
import java.util.*;
public class NobleIntegerNotDistinctGreater {
    static int findNobleIntegers(int[]A) {
        //hint: sort in descending order since greater than
        int N=A.length;
        int count=0;
        int ans=0;
        Arrays.sort(A);

        for (int i=0; i<N/2; i++) {
            int temp=A[N-1-i];
            A[N-1-i]=A[i];
            A[i]=temp;
        }

        if (A[0]==0) {
            ans=1;
        }

        for (int i=1; i<N; i++) {
            if (A[i]!=A[i-1]) {
                count=i;
                if (count==A[i]) {
                    ans++;
                }
            }

        }
        if (ans>0) {
            return ans;
        }
        return -1;


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(findNobleIntegers(A));
    }


}
//TC is O(nlogn), SC is O(1)