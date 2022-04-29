package sorting;
//find number of noble integer where data isnt distinct (means data can repeat)
//hint:1st sort
//if elements are repeating that count for that element remains same
import java.lang.*;
import java.util.*;
public class NobleIntegerNotDistinct {
    static int findNobleInteger(int[]A) {
        int N=A.length;
        Arrays.sort(A);
        //if A[i]=A[i-1], count remains same
        //if A[i]!=A[i-1], count becomes the index value

        //edge case is 0th index
        int count=0;
        int ans=0;
        if (A[0]==0) { //edge case
            ans=1;
        }

        for (int i=1; i<N; i++) {
            if (A[i]!=A[i-1]) {
                count=i;
            }
            if (count==A[i]) {
                ans=ans+1;
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
        System.out.println(findNobleInteger(A));

    }

}
//TC is O(nlogn), SC is O(1)
