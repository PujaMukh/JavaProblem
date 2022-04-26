package ModularArithmatic;
//an array contains number from 1 to n
//1 number will be twice and another number will be missing
//return an array containing the missing number 2nd and repeat number 1st
//original array cannot be modified
//I did it in O(N) TC and O(N) SC

import java.lang.*;
import java.util.*;

public class RepeatAndMissingNumberArray {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        int N=A.size();
        int repeatElement=0;
        int missingElement=0;
        //now make another arraylist to and make all elements there 0
        int[]temp=new int[N];
        for (int i=0; i<N; i++) {
            temp[i]=0;
        }

        //now traverse again through arraylist A and change indexes in array temp

        //find repeat element
        for (int i=0; i<N; i++) {

            if(A.get(i)>0) {

                if (temp[A.get(i)-1]==-1) {
                    repeatElement=A.get(i);
                }
                else {
                    temp[A.get(i)-1]=-1;
                }
            }

        }

        //traverse again and find missing element
        for (int i=0; i<N; i++) {
            if (temp[i] !=-1) {
                missingElement=i+1;
            }
        }
        //now make an array to return the o/p
        ArrayList<Integer>output=new ArrayList<Integer>();
        output.add(repeatElement);
        output.add(missingElement);
        return output;

    }
}
//TC is O(N), SC is O(N)
