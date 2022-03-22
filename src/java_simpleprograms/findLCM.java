package java_simpleprograms;
//find lcm of 2 numbers

import java.lang.*;
import java.util.*;
public class findLCM {
static int findLCM(int A,int B) {
    //1st find min and max
    int min=0;
    int max=0;
    int result=0;
    int output=0;
    if (A>B) {
        max=A;
        min=B;
    }
    else {
        max=B;
        min=A;
    }

    if (max%min==0) {
        return max;
    }
    else {
        for (int i=2; i<=max*max; i++) {
            result=max*i;
            if (result%min==0) {
                output=result;
                break;
            }
        }
    }
    return output;
}
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.print(findLCM(A, B));
    }
}
