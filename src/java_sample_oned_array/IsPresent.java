package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class IsPresent {
    static int solve(int B, ArrayList<Integer>A) {
        //check if B is present in array A

        for (int i = 0; i < A.size(); i++) { //for loop to check if B is present in array A
            if (B == A.get(i)) { //if B is present, return 1
                return 1;
            }
        }
        return(0); //if B is not present in array A, it will come out of loop and return 0
    }
    public static void main(String args[]) {
            ArrayList<Integer>A=new ArrayList<Integer>(); //create new arraylist
            Scanner sc=new Scanner(System.in);
            int B=sc.nextInt();                      //taking integer input B

        int N = sc.nextInt();     //taking input N which is the size of array
        for (int i=0; i<N; i++) {   //creating a loop to take N inputs
            int num=sc.nextInt();
            A.add(num);           //add value to array A
        }

        System.out.print(solve(B,A));
        }
}
