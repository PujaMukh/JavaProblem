package hashing;
//given 2 arrays, find all common elements. The answer should return all elements which are common
//eg if 2 appears 2 times in A and 2 tmes in B, return 2 two times.

import java.lang.*;
import java.util.*;
public class FindAllCommonElements {
    static int[] solve(int[] A, int[] B) {
        int N=A.length;
        int M=B.length;

        HashMap<Integer,Integer>AToFreq=new HashMap<>();

        for (int i=0; i<N; i++) {
            if (AToFreq.containsKey(A[i])) { //if there
                int val=AToFreq.get(A[i]); //get the value
                AToFreq.put(A[i], val+1); //update the existing value
            }
            else { //if not there put 1 in HashMap
                AToFreq.put(A[i], 1);

            }
        }

        ArrayList<Integer>temp=new ArrayList<Integer>(); //to store the o/p arraylist

        for (int i=0; i<M; i++) {
            if (AToFreq.containsKey(B[i])) { //if the element in B is there is HashMap
                if (AToFreq.get(B[i])>0) { //if the value is greater than 0
                    temp.add(B[i]); //add it to result

                }

                int val=AToFreq.get(B[i]); //time to get the value and decrease the freq by 1
                AToFreq.put(B[i], val-1);


            }
        }
        int P=temp.size();
        int[]output=new int[P];
        for (int i=0; i<P; i++) {
            output[i]=temp.get(i);
        }
        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int M=sc.nextInt(); //take input for size of array
        int[]B=new int[M]; //declare input array
        for (int i=0; i<M; i++) { //take input for array elements
            B[i]=sc.nextInt();
        }
        int[]output=solve(A, B);
        int P=output.length;
        for (int i=0; i<P; i++) {
            System.out.print(output[i]+" ");
        }
    }
}
//TC is O(N), SC is O(N)
