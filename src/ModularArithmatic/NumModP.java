package ModularArithmatic;
//given a number in array, calculate number%p
//eg 78962. each digit will be in different array blocks, p=5, ans=2

import java.lang.*;
import java.util.*;

public class NumModP {
    static int numMod(int[]A, int p) {
        int N=A.length;
        int ans=1;
        int finalAns=0;
        for (int i=N-1; i>=0; i--) {
            finalAns=finalAns+((A[i]%p)*(ans%p))%p;
            finalAns=finalAns%p;
            ans=(ans*10)%p;

        }
        return finalAns;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int p=sc.nextInt();
        System.out.println(numMod(A,p));
    }
}
//TC is O(N), SC is O(1)
