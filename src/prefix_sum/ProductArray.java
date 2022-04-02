package prefix_sum;
//given an array, return a product array of same size where ith element will be product
//of all elements in A array divided by ith element

//brute force is to loop through all elements and find product of all elements
//then create another loop to divide  prod by A[i]
//but we will use product array

import java.lang.*;
import java.util.*;

public class ProductArray {
    static int[] prodArray(int[]A) {
        int N=A.length;
        //since direct division is a costly process, create 2 arrays which will store the product
        //one from front, one from back
        int[]prod_front=new int[N]; //declare new product front array
        int[]prod_back=new int[N];// declare new product from back array

        //1*2*3*4*5/3=1*2 * 4*5
        //creating 2 arrays from front and back as want t ignore each index fully and shouldnt contain
        //product of the element to be deleted

        prod_front[0]=A[0]; //edge case
        prod_back[N-1]=A[N-1]; //edge case

        for (int i=1; i<N; i++) { //constructing prefix product front array
            prod_front[i]=prod_front[i-1]*A[i];
        }
        //constructing prefix product back array
        for (int i=N-2; i>=0; i--) {
            prod_back[i]=prod_back[i+1]*A[i];
        }

        //now create another array to return the o/p
        int[]output=new int[N];
        for (int i=0; i<N; i++) {
            if (i==0) {
                output[i]=prod_back[i+1];
            }
            else if (i==N-1) {
                output[i]=prod_front[i-1];
            }
            else if (i>0 && i<N-1) {
                output[i]=prod_front[i-1]*prod_back[i+1];
            }

        }
        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int[]output=prodArray(A);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" ");
        }

    }
}
//TC is O(N), SC is O(N)