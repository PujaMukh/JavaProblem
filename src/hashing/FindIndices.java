package hashing;
//given a query and an array, return indices in which the query exists in the array

import java.lang.*;
import java.util.*;
public class FindIndices {
    static ArrayList<Integer> findIndices(int[]A, int Q ) {
        int N=A.length;
        HashMap<Integer,ArrayList<Integer>>QueryToIndices=new HashMap<>(); //declare

        for (int i=0; i<N; i++) {
            //now check if the key is already there in hashmap
            if (QueryToIndices.containsKey(A[i])) {
                ArrayList<Integer>value=QueryToIndices.get(A[i]);
                value.add(i);
            }
            else {
                ArrayList<Integer>value=new ArrayList<>();
                value.add(i);
                QueryToIndices.put(A[i],value);
            }
        }
        if (QueryToIndices.containsKey(Q)) {
            return QueryToIndices.get(Q);
        }
        return new ArrayList<Integer>();

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int Q=sc.nextInt();
        ArrayList<Integer>output=findIndices(A,Q);
        int M=output.size();
        for (int i=0; i<M; i++) {
            System.out.print(output.get(i)+" ");
        }
    }
}
//TC is O(N), SC is O(N)
