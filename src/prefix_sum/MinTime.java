package prefix_sum;
//given an array, at any time an element can be increased by 1 in 1 sec
//find the minimum time required to make all elements of array equal
//1 way is to find the max by iterating and then do sum+max-A[i]

import java.lang.*;
import java.util.*;
public class MinTime {
    static int minTime(ArrayList<Integer>A) {
        int max=0;
        int N=A.size(); //size of array
        for (int i=0; i<N; i++) {
            if (A.get(i)>max) {
                max=A.get(i);
            }
        }
        int sum=0;
        for (int i=0; i<N; i++) {
            sum=sum+(max-A.get(i));
        }
        return sum;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer>A=new ArrayList<Integer>(); //declare new arraylist
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
        System.out.print(minTime(A));
    }
}
//TC is O(N) and SC is O(1)