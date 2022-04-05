package carry_forward;

//given an array, find all leaders in the array
//an element is a leader if it is greater than all elements to its right
//an element on rightmost is always the leader

import java.lang.*;
import java.util.*;

public class FindAllLeaders {
        static ArrayList<Integer> findCount(int[]A) {
            //1st iterate and find max
            int N=A.length; //size of given array
            int max=A[N-1]; //last element is always leader

            //make an arraylist to store the output
            ArrayList<Integer>output=new ArrayList<Integer>();
            output.add(A[N-1]); //since last element is always a leader

            for (int i=N-2; i>=0; i--) {
                if (A[i]>max) {
                    max=A[i];
                    output.add(A[i]);
                }
            }
            return output;

        }

        public static void main(String args[])   {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt(); //take input for size of array
            int[]A=new int[N]; //declare new array
            for (int i=0; i<N; i++) { //take input for all elements in array A
                A[i]=sc.nextInt();
            }
            ArrayList<Integer>output1=findCount(A); //since above function is returning an arraylist, store it in an arraylist
            int M=output1.size(); //size of arraylist which has all elements
            for (int i=0; i<M; i++) {
                System.out.print(output1.get(i)+" ");

        }

    }
//time complexity is O(N) and space complexity is O(N)

}
