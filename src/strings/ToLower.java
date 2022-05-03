package strings;
//given a string containing a mix of capital, small, numbers etc, convert all the capital to lower
//and leave everything else the same

import java.lang.*;
import java.util.*;
public class ToLower {
    static ArrayList<Character> to_lower(ArrayList<Character> A) {
        int N=A.size();
        ArrayList<Character>output=new ArrayList<Character>(); //to store o/p
        for (int i=0; i<N; i++) {
            if (A.get(i)>=65 && A.get(i)<=90) {
                int d=(int)A.get(i)^32;
                output.add((char)d);

            }
            else {
                output.add(A.get(i));

            }

        }
        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Character>A=new ArrayList<Character>();
        for (int i=0; i<N; i++) {
            A.add(sc.next().charAt(0));
        }
        ArrayList<Character>output=to_lower(A);
        for (int i=0; i<N; i++) {
            System.out.print(output.get(i)+" ");
        }

    }
}
//TC is O(N), SC is O(1) if not considering o/p