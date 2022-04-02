package prefix_sum;
//count how many special indices are there in the given array
//index is said to be special if after deleting the index, sum of all even index=sum of all odd index
//brute force way is to write a function to delete each index and shift elements to left/right
//and then calculate sum each time

//we will do it in an optimized way

import java.lang.*;
import java.util.*;
public class CountSpecialndex {
    static int countIfSpecial(int[]A) {
        int N=A.length; //length of array A

        //1st we have to create prefixevensum array and prefixoddsum array

        int[]sumeven=new int[N];
        int[]sumodd=new int[N];

        sumeven[0]=A[0]; //edge case
        sumodd[0]=0;  //edge case

        //now construct sumeven array containing sum of all even indices
        for (int i=1; i<N; i++) {
            if (i%2==0) {
                sumeven[i]=sumeven[i-1]+A[i];
            }
            else {
                sumeven[i]=sumeven[i-1];
            }
        }

        //now construct sumodd array

        for (int i=1; i<N; i++) {
            if (i%2!=0) {
                sumodd[i]=sumodd[i-1]+A[i];
            }
            else {
                sumodd[i]=sumodd[i-1];
            }
        }

        int count=0;
        //now we have to iterate through each element and virtually delete to find if index is special

        for (int i=0; i<N; i++) {
            int sume=0;
            int sumo=0;
            if (i==0) {  //handling edge case
                sume=0+ sumodd[N-1]-sumodd[i];
                sumo=0+ sumeven[N-1]-sumeven[i];
            }
            else if (i!=0){
                sume=sumeven[i-1] +sumodd[N-1]-sumodd[i];
                sumo=sumodd[i-1]+sumeven[N-1]-sumeven[i];
            }
            if (sume==sumo) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size
        int[]A=new int[N]; //declare input array A
        for (int i=0; i<N; i++) { //take input for all elements in arary A
            A[i]=sc.nextInt();
        }
        System.out.print(countIfSpecial(A)); //print
    }

}
//TC is O(N) and SC is O(n)