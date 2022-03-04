package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class NewspaperProb {
    /*given A and B[i], determine which day of week will I finish reading newspaper
    where A is total number of lines in newspaper and B[i] contains how many lines to read each
    day from Mon to Sun */

    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();   //taking input A which is the total lines in newspaper

        int[] B=new int[7]; //create new array B of size 7 for each day of the week
        for (int i=0; i<7; i++) {
            B[i]=sc.nextInt();     //taking input for the blank newly created array B
        }
        int c=A-B[0]; //initializing c before entering the loop

        for (int i=1; i<7; i++) { //for loop to find when I will finish reading newspaper
            c = c-B[i];
            if (c <=0) {
                System.out.print(i+1);
                break;
            }
        }
    }
}
