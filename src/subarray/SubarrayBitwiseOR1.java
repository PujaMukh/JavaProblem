package subarray;
//find the number of subarrays with bitwise OR 1

import java.lang.*;
import java.util.*;
public class SubarrayBitwiseOR1 {
    static int subarray(ArrayList<Integer>A) {
        //hint: 1)find total number of subarrays possible by formula n(n+1)/2
        //2) look for only 0's and continuous 0's
        //3) do //1- //2

        int N=A.size();
        int subarrayZero=0;
        int count=0;

        for (int i=0; i<N; i++) {

            if (A.get(i)==0) {
                count++;
            }
            else if (A.get(i)==1) {
                subarrayZero=subarrayZero+((count)*(count+1))/2;
                count=0; //start count fresh if there is a 1
            }

            if (i==N-1 && count>0) {
                //when there are continuous 0's and it is the end
                subarrayZero=subarrayZero+((count)*(count+1))/2;

            }


        }
        return (N*(N+1)/2)-subarrayZero;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        ArrayList<Integer>A=new ArrayList<Integer>();

        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
        System.out.println(subarray(A));
    }
}
//TC is O(N), SC is O(1)
