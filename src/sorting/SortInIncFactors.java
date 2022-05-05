package sorting;

import java.lang.*;
import java.util.*;

//sort in increasing order of number of factors using comparator
class fac implements Comparator<Integer> { //create your own class
    public int fact(Integer a) { //function to find number of factors of a given number
        int count=0;
        for (int i=1; i<=a; i++) {
            if (a%i==0) {
                count++;
            }
        }
        return count;

    }

    public int compare(Integer a, Integer b) { //function name here has to be compare
        int fa=fact(a);
        int fb=fact(b);
        if (fa<fb) {
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
        else {
            return 1;
        }
    }
}
public class SortInIncFactors {
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
//TC is nlogn, SC is O(1)
