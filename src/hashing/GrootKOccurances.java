package hashing;
import java.lang.*;
import java.util.*;
//given an array, we can only pick nos with k occurnaces and add it only once. Find res.
//If none return -1. Find res
//eg 1 2 2 3 3. k=2. Ans=2+3=5 (as 2 has 2 occurances and 3 has 2 occurances
public class GrootKOccurances {
    static int getSum(int A, int B, int[] C) {
        //take examples 4 0's and k= 4, then sum=0
        //take example k=1 and 4 0's, ans shuld be -1
        //picks those with freq k
        //if nothing return 1
        HashMap<Integer, Integer>hm=new HashMap<Integer, Integer>();
        HashSet<Integer>hs=new HashSet<Integer>();
        int sum=-1;

        for (int i=0; i<A; i++) {

            if (hm.containsKey(C[i])) {     //cal freq and C[i]
                int val=hm.get(C[i]);
                hm.put(C[i], val+1);

            }

            else {
                hm.put(C[i], 1);
            }
        }

        for (int i=0; i<A; i++) {

            if (hm.get(C[i])==B) {

                if (hs.contains(C[i])) { //once we have worked on one two, put it in hs so we dont work on it again
                }
                else {
                    hs.add(C[i]);

                    if (sum==-1) { //1st sum will always enter here
                        sum=C[i];
                    }
                    else {
                        sum=sum+C[i];
                    }
                }
            }
        }


        if (sum<0) {
            return -1;
        }
        return sum;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input for size of array
        int[]C=new int[A]; //declare input array
        for (int i=0; i<A; i++) { //take input for array elements
            C[i]=sc.nextInt();
        }
        int B=sc.nextInt();
        System.out.println(getSum(A,B,C));
    }
}
//TC is O(N), SC is O(N)