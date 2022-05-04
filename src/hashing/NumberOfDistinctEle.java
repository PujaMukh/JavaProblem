package hashing;

import java.lang.*;
import java.util.*;

//given N elements, find number of distinct elements
public class NumberOfDistinctEle {
    static int findNumberOfDistinctElements(int[]A) {
        //trick is to find th size of hashset. In hasset, we dont even have to check if ele is present
        //and then update. We just have to keep adding everything and hashset will ignore if double
        int N=A.length;
        HashSet<Integer>ele=new HashSet<>(); //declare hashset

        for (int i=0; i<N; i++) {
            ele.add(A[i]);
        }
        return ele.size();
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(findNumberOfDistinctElements(A));
    }
}
//TC is O(N), SC is O(N)
