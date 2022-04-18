package BitManupulation;
//give N array elements, every number repeats twice except 1. Find that number

import java.lang.*;
import java.util.*;
public class UniqueElement {
    static int findUnique(int[]A) {
        int N=A.length;
        int ans=0;


        for (int i=0; i<N; i++) {
            ans=ans^A[i];
        }
        return ans;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(findUnique(A));
    }

}

//TC is O(N), SC is O(1)
