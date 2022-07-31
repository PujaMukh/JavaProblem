package arrays_maths;

public class LuckyNumbers {
    //A lucky number is a number that has exactly 2 distinct prime divisors.

   // You are given a number A, and you need to determine the count of lucky numbers
    // between the range 1 to A (both inclusive).

    public int solve(int A) {
        //Eratosthenes siev
        //make an array with ranges upto A+1
        int[] temp=new int[A+1];
        boolean[] boolTemp=new boolean[A+1];

        //boolean array will be marked all true at 1st
        //Then start from 2 and for each multiple of 2 starting from 2*2 will be marked false and count inc in temp array
        //do it only if it is true, if false ignore it
        //at the end, traverse through temp array and make a count of all values with val 2

        for (int i=0; i<(A+1); i++) {
            boolTemp[i]=true;
        }

        for (int i=2; i<(A+1); i++) {

            if (boolTemp[i]==true) {
                int j=2;
                while ((j*i)<(A+1)) {

                    boolTemp[j*i]=false;
                    temp[j*i]++;
                    j=j+1;



                }

            }


        }
        int count=0;

        for (int i=0; i<(A+1); i++) {
            if (temp[i]==2) {
                count++;
            }
        }
        return count;
    }
}
