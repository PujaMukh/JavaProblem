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
        //reverse
        for (int i=0; i<N/2; i++) { //O(N)
            int temp=A[N-1-i];
            A[N-1-i]=A[i];
            A[i]=temp;
        }
        int minCost=0;
        for (int i=0; i<N; i++) { //O(N)
            minCost=minCost+A[i]*(i+1);
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
