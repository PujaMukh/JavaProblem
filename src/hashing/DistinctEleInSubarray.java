package hashing;

import java.lang.*;
import java.util.*;

//given N array ele, calculate no of distinct ele in every subarray of size k
//eg 2 4 3 8 3 9 4 9 4 10, k=4, ans=22
public class DistinctEleInSubarray {
    static int calculateDistinctEle(int[]A, int k) {
       int N=A.length;
       int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
       if (N<k) {
           return -1;
       }
       else {
           //considering 1st k elements and cannot delete anything before 0th index
           //1st consider 1st k elements and calculate freq and use window sliding in loop and delete and add ele
           for (int i=0; i<k; i++) {
               if (hm.containsKey(A[i])) {  //hashmap for freq of 1st k elements
                   int val=hm.get(A[i]);
                   hm.put(A[i], val+1);
               }
               else {
                   hm.put(A[i],1);
               }
           }

           count=count+hm.size();

           int start=1;
           int end=k;

           while (end<N) {


                   int val= hm.get(A[start-1]); //remove
                   hm.put(A[start-1], val-1);

                   if (hm.get(A[start-1])==0) {
                       hm.remove(A[start-1]);   //remove if 0
                   }

                   if (hm.containsKey(A[end])) {
                       val=hm.get(A[end]);       //adding freq of only end index ele
                       hm.put(A[end], val+1);

                   }
                   else {
                       hm.put(A[end],1);
                   }
               count=count+hm.size();

               start++;
               end++;
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
        System.out.println(calculateDistinctEle(A,k));
    }

}
//TC is O(N), SC is O(1)
