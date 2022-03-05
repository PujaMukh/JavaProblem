package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class SearchK {
    //given an array, search for element k and return true if present.
    static boolean SearchK(int[] A, int K) {

        for (int i=0; i<A.length; i++) { //for loop to check if k is present in arr[i]
            if (K==A[i]) {
                return true;
            }
        }
        return false;    //if not present in whole loop, return false
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //take input for size of array

        int[] A = new int[N]; //declare blank array

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); //for loop to take input in blank array
        }
        int K = sc.nextInt(); //take input for k


            System.out.print(SearchK(A,K)); //call array A and int K from function SearchK

    }
    }

