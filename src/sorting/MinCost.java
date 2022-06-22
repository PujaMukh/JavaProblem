package sorting;
//at every step remove an array element
//cost to remove an element=sum of elements left in array
//find min cost to remove all elements

import java.util.*;

//hint:start with the largest number, that way we will use big elements less and get min cost
public class MinCost {
    static int findMinCost(int[]A) {
        int N=A.length;
        Arrays.sort(A); //O(nlogn)

        int minCost=0;
        for (int i=N-1; i>=0; i--) { //O(N)
            minCost=minCost+A[i]*(N-i);
        }
        return minCost;


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(findMinCost(A));
    }

}
//TC is O(Nlogn), SC is O(1)
