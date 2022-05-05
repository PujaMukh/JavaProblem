package sorting;

import java.lang.*;
import java.util.*;

//sort in increasing order of number of digits using comparator
//if 2 elements have same number of digits, element with more value come 1st
class digits implements Comparator<Integer> {
    //function to find number of digits  //1) logic
    public int findDigits(Integer A) {
        int count=0;
        while (A>0) {
            int d=A%10;
            count++;
            A=A/10;
        }
        return count;
    }
    //function to compare
    public int compare(Integer a, Integer b) { //2)compare
        int fa=findDigits(a);
        int fb=findDigits(b);

        if (fa<fb) {
            return -1; //-1 means it will not change
        }
        else if (fa==fb) {
            if (a<b) {
                return 1;
            }
            else {
                return -1;
            }
        }
        else {
            return 1;
        }
    }
}
public class SortInIncDigits {
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        Integer[]A=new Integer[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        //3)now sort
        Arrays.sort(A,new digits());
        for (int i=0; i<N; i++) {
            System.out.print(A[i]+" ");

        }
    }

}
//TC is O(logn*nlogn), SC is O(1)
//log n for finding number of digits and nlogn for sort function
