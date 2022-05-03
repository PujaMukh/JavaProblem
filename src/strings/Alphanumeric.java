package strings;
//return 1 if all characters are from a-z, A-Z or 0-9. Else return 0

import java.lang.*;
import java.util.*;
public class Alphanumeric {
    static int solve(ArrayList<Character> A) {
        int N=A.size();

        for (int i=0; i<N; i++) {
            if ((A.get(i)>='a' && A.get(i)<='z') || (A.get(i)>='A' && A.get(i)<='Z') || (A.get(i)>='0' && A.get(i)<='9')){
            }
            else {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        ArrayList<Character>A=new ArrayList<Character>();
        for (int i=0; i<N; i++) {
            A.add(sc.next().charAt(0));
        }
        System.out.println(solve(A));
    }
}
//TC is O(N), SC is O(1)

