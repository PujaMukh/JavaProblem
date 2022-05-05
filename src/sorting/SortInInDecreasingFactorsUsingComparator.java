package sorting;

import java.lang.*;
import java.util.*;

//sort the given array in decreasing number of factors using comparator.
//If 2 elements have same number of factors, then element with lesser value comes 1st
class fac implements Comparator<Integer> {

    //make a function that finds factors of an integer
    public int fact (Integer a) {
        int count=0;
        for (int i=1; i<=a; i++) {
            if (a%i==0) {
                count++;
            }
        }
        return count;
    }

    //a function that compares 2 elements
    public int compare(Integer a, Integer b) { //teh function name here has to be compare
        int fa=fact(a);
        int fb=fact(b);
        if (fa>fb) { //if -1, it will not change. If 1, it will swap
            return -1;
        }
        else if (fa==fb) {
            if (a<b) {
                return -1;
            }
            else {
                return 1;
            }
        }
        else{
            return 1;
        }
    }

}
public class SortInInDecreasingFactorsUsingComparator {
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        Integer[]A=new Integer[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        Arrays.sort(A, new fac()); //sort (array name, new class name())
        for (int i=0; i<N; i++) {
            System.out.print(A[i]+" ");
        }
    }

}
//TC is nlogn, SC is 1
