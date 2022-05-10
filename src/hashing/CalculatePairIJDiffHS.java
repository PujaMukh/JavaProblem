package hashing;
//now check if there is a pair i,j such that A[i]-A[j]==k and i!=j using hashset and 1 loop
import java.util.HashSet;
import java.util.Scanner;

public class CalculatePairIJDiffHS {
    static boolean checkIf(int[] A, int k) {
        int N = A.length;
        HashSet<Integer> hs = new HashSet<>();
        //iterate and calculate b
        //if hs doesnt contain b,add it.
        //if hs contains A[i], return true coz we have a pair
        //we are searching for b=A[i]-k in loop. When we get it in the array, that means we have a pair
        for (int i = 0; i < N; i++) {
            //eg k==8, A[]= 8 9 1 5 6, ans should be true
            //eg 1 6 3, k=2, ans true (with 1 we can do 1--1 to make it 2 or 1+2=3, so 1-3=2)
            //if b is not present in hs, add b
            if ((hs.contains(A[i]+k)) || (hs.contains(A[i]-k))){
                return true;
            } else {
                hs.add(A[i]);
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //take input for size of array
        int[] A = new int[N]; //declare input array
        for (int i = 0; i < N; i++) { //take input for array elements
            A[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(checkIf(A, k));
    }
}
//TC is O(N), SC is O(N) and 1 loop