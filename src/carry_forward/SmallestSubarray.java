package carry_forward;
//given an array, find the length of the smallest subarray which contains both min and max
//of the array

import java.lang.*;
import java.util.*;
public class SmallestSubarray {
    static int subArray(int[]A) {
        //1)1st iterate and find min and max in the array
        //2) then start loop from one end and calculate considering 1st element we get is min
        //3) edge case is if all elements are equal

        int N=A.length; //size of array A
        int min_index=-1; //since we dont know it yet and it has to be outside range of 0 and N
        int max_index=-1; //same reason as above

        //1)iterate and find min and max 1st
        int max=A[N-1]; //initializing both max and min
        int min=A[0];
        for (int i=0; i<N; i++) {
            if (A[i]>=max) {
                max=A[i];
            }
            else if (A[i]<=min){
                min=A[i];
            }
        }
        //now we got max and min in the array.
        //now move on to step 2
        int result=N; //considering worst case scenario, index 0 can have min and index N-1 cam have max
        //and also because we have to calculate minn of length and result everytime.
        int length=0;
        for (int i=0;i<N; i++) {

            if (min==max) { //edge case line 31 and 32
                return 1;
            }
            else {

                if(A[i]==min) {
                    min_index=i;

                    if (max_index!=-1) {
                        length=min_index-max_index+1;
                        result=Math.min(length,result);
                    }
                }

                else if (A[i]==max) {
                    max_index=i;

                    if (min_index!=-1) {
                        length=max_index-min_index+1;
                        result=Math.min(length,result);
                    }
                }


            }

        }
        return result;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for all elements in array A
            A[i]=sc.nextInt();
        }
        System.out.print(subArray(A));
    }

}
//Time complexity is O(N) and Space complexity is O(1)
