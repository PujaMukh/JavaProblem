package optimized_simpleprograms;
//given an array A with height of christmas tree and an array B with cost of them,
//find the min cost to chose 3 trees in ascending order
import java.lang.*;
import java.util.*;


public class ChristmasTree {
    static int christmasTree (ArrayList<Integer>A, ArrayList<Integer>B) {
        //logic:fix a mid j, left i and right k
        //for every mid find the min cost on left side if more than 1 on leftside
        //same for right side
        //mid will be ++
        //lastly min of all the ans we got
        int N=A.size();
        int minSum=Integer.MAX_VALUE;

        for (int j=1; j<N-1; j++) { //middle element
            int sum=0;
            int right=Integer.MAX_VALUE;
            int left=Integer.MAX_VALUE;

            //leftside traverse
            for (int i=0; i<=j-1; i++) {
                if (A.get(i)<A.get(j)) {

                    left=Math.min(left,B.get(i)); //if more than 1 smaller in left, find the one with minimum cost
                }
            }
            //right traverse
            for (int k=j+1; k<N; k++) {
                if(A.get(k)>A.get(j)) {

                   right=Math.min(right, B.get(k));
                }
            }

            if (left!=Integer.MAX_VALUE && right!=Integer.MAX_VALUE) { //if there is no left or right,
                //do not calculate the sum and minsum
                sum=left+right+B.get(j);
                minSum=Math.min(sum, minSum);
            }

        }
        return minSum;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array

        ArrayList<Integer>A=new ArrayList<Integer>(); //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
           A.add(sc.nextInt());
        }

        ArrayList<Integer>B=new ArrayList<Integer>(); //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            B.add(sc.nextInt());
        }
        System.out.println(christmasTree(A,B));
    }

}
//TC is O(N^2), SC is O(1)
