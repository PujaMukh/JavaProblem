package Window_Sliding;
//given a binary array, we can atmost replace a single 0 with 1. Find max consequetive 1's

import java.lang.*;
import java.util.*;
public class AtmostReplace1 {
    static int replaceZeroWithOne(int[]A) {
        //logic: keep iterating and if ar[i]=0,
        //i) count number of 1's on left and break if it hits 0
        //ii) count number of 1's on right and break if it is 0
        //find max of ans and left+right+1 (1 as we are virtually replacing a 0 with 1

        //edge case: if everthing is 1, it wont enter any loop and return the ans as 0 whereas it should be length of array
        //in that case at 1st, iterate and keep counting 1's. If count==N, return N

        int N=A.length;
        int ans=0;
        //edge case if all numbers are 1
        int count=0;
        for (int i=0; i<N; i++) {
            if (A[i]==1) {
                count++;
            }
        }
        if (count==N) {
            return count;
        } //edge case handled


        //now iterate again and once it hits a 0 we will bfreak into 2 loops
        for (int i=0; i<N; i++) {

            if (A[i]==0) {

                //1st loop left traverse
                int left=0;
                for(int j=i-1; j>=0; j--) {
                    if (A[j]==1) {
                        left++;
                    }
                    else if(A[i]==0) {
                        break;
                    }
                }

                //now traverse to right and count 1's
                int right=0;
                for (int j=i+1; j<N; j++) {
                    if (A[j]==1) {
                        right++;
                    }
                    else {
                        break;
                    }
                }

                ans=Math.max(ans, left+right+1);



            }
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
        System.out.println(replaceZeroWithOne(A));
    }
}
//TC is O(N) here even though we are running 2 loops because the j inside is running finite times always,
//SC is O(1)