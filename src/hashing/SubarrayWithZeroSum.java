package hashing;

import java.lang.*;
import java.util.*;

//find if there is a subarray with 0 sum in the given array using hashmap or hashset
//hint: take a hashset and put the sum in it if not already present.
//if the same sum is present that means we can return true.
//edge case is there might be a 0 in the element, then it is still a subarary with sum 0 and it still has to return true
//so we will add a zero in the subarray to handle this edge case
//take ex. 1 2 -2 4 -4. Here length of largest subarray is 4 from index 1 to 4
public class SubarrayWithZeroSum {
    static boolean checkIfSubarraySumZero(int[]A) {
        //declare a hashset since we only need to deal with sum
        HashSet<Integer>sumHashSet=new HashSet<>();
        int sum=0;
        int N=A.length;
        sumHashSet.add(0); //edge case
        //now inside if it still gets 0, that means the element has to be 0 as 0+0=0

        for (int i=0; i<N; i++) {

            sum=sum+A[i];
            if (sumHashSet.contains(sum)) { //if it is repeating return true based on logic written in comments
                return true;
            }
            else {
                sumHashSet.add(sum);
            }
        }
        return false;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(checkIfSubarraySumZero(A));
    }
}
//TC is O(N), SC is O(N)