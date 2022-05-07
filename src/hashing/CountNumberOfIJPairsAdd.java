package hashing;

import java.lang.*;
import java.util.*;

//count number of pairs i,j such that A[i]+A[j]==k and i!=j
public class CountNumberOfIJPairsAdd {
    static int countPairs(int[]A, int k) {
        int N=A.length;
        HashSet<Integer>hs=new HashSet<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0;

        for (int i=0; i<N; i++) {
            int b=k-A[i];
            if (hs.contains(b)) {
                if ((hm.containsKey(A[i])) || hm.containsKey(b)){
                    count=count;
                }
                else if (A[i]<=b) {
                    hm.put(A[i],b);
                    count++;
                }
                else {
                    hm.put(b,A[i]);
                    count++;
                }

            }
            else {
                hs.add(A[i]);
            }
        }
        return count;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
       int k=sc.nextInt();
        System.out.println(countPairs(A,k));
    }

}
//TC is O(N), SC is O(N)