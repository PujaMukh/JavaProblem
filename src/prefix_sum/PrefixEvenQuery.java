package prefix_sum;
//given an array and queries, calculate sum of all even indices in that query range

import java.lang.*;
import java.util.*;
public class PrefixEvenQuery {
    static int prefixEven(int[]A, int right, int left) {
        int N=A.length; //length of given array
        int[]sumeven=new int[N]; //declaring a new array to store the sum of all even indexes

        sumeven[0]=A[0]; //edge case

        for (int i=1; i<N; i++) {
            if (i%2==0) {
                sumeven[i]=sumeven[i-1]+A[i];
            }
            else{
                sumeven[i]=sumeven[i-1];
            }
        }

        //now prefixeven sum array is constructed

        //now come to queries

        for (int i=0; i<N; i++) {
            if (left==0) {  //edge case is left==0
                return sumeven[right];
            }
            else {
                return sumeven[right]-sumeven[left-1];
            }
        }
        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size
        int[]A=new int[N]; //declare A array
        for (int i=0; i<N; i++) { //take input for A array
            A[i]=sc.nextInt();
        }
        int right=sc.nextInt(); //take input for right index
        int left=sc.nextInt(); //take input for left index
        System.out.print(prefixEven(A, right, left));
    }
}
//TC is O(N), SC is O(N) as new array is created