package arrays_maths;
//find if any int occurs more than N/3 times in an array in O(N) time and O(1) space
//when it is N/3, max 2 elements
//use moore's algorithm

import java.lang.*;
import java.util.*;
public class NBy3RepeatElement {
    static int repeatedNumber(final List<Integer> a) {
        //when it is N/3, max 2 elements
        //use moore's algorithm

        int N=a.size();

        if (N==1) {
            return a.get(0); //edge case
        }
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int freq1=0;
        int freq2=0;
        int count1=0;
        int count2=0;

        for (int i=0; i<N; i++) {

            if (a.get(i)==ele1) {
                freq1++;
            }
            else if (a.get(i)==ele2) {
                freq2++;
            }
            else if (freq1==0) {
                ele1=a.get(i);
                freq1++;
            }
            else if(freq2==0) {
                ele2=a.get(i);
                freq2++;
            }
            else {
                freq1--;
                freq2--;
            }

        }

        //now traverse and see if the count>N/3
        for (int i=0; i<N; i++) {
            if (ele1==a.get(i))  {
                count1++;
            }
            else if (ele2==a.get(i)) {
                count2++;
            }
        }
        if (count1>N/3) {
            return ele1;
        }
        else if (count2>N/3) {
            return ele2;
        }
        return -1;

    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
       ArrayList<Integer>a=new ArrayList<Integer>();
       for (int i=0; i<N; i++) {
           a.add(sc.nextInt());
       }
        System.out.println(repeatedNumber(a));

    }
}
//TC is O(N), SC is O(1)
