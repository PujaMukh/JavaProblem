package java_string;
//trim stars from both ends
//eg. **he*l*llo***, o/p=he*l*llo

import java.lang.*;
import java.util.*;
public class TrimStars {
    static String trim(String A) {
        int N=A.length();
        int count_front=0;
        int count_back=0;
          int i=0;
            while(i<N && A.charAt(i)=='*') {
                i++;
                count_front++;
            }

          int j=N-1;
            while (j>=0 && A.charAt(j)=='*') {
                j--;
                count_back++;
            }

        //make a stringbuilder to store the result
        StringBuilder S=new StringBuilder();
        for (int k=count_front; k<N-count_back; k++) {
            S.append(A.charAt(k));
        }
        //now convert the stringbuilder to string and return
        String output=S.toString();
        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(trim(A));
    }
}
//TC is O(N) and SC is O(N)