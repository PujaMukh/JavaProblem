package subarray;
//keep xoring all subarrays and xor the results as well and return the final number
import java.lang.*;
import java.util.*;
public class XORIngSubarrays {
    static int xorIng(int[]A) {
        //hint: find how many times index i appears in subarrays
        //if the no is even, it will get 0'ed out, so leave it alone
        //if odd, xor it

        int N=A.length;
        int res=0;
        int ans=0;

        for (int i=0; i<N; i++) {
            res=(i+1)*(N-i);

            if ((res & 1)==1) { //if odd
                ans=ans^A[i];
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
        System.out.println(xorIng(A));
    }
}
//TC is O(N), SC is O(1)