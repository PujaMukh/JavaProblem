package strings;
//if anything is small, change to upper, else leave it alone
import java.lang.*;
import java.util.*;
public class ToUpperUsingXor {
    static ArrayList<Character> toUpper(ArrayList<Character>A) {
        int N=A.size();
        ArrayList<Character>output=new ArrayList<Character>();

        for (int i=0; i<N; i++) {
            if (A.get(i)>='a' && A.get(i)<='z') {
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
        ArrayList<Character>output=toUpper(A);
        for (int i=0; i<N; i++) {
            System.out.print(output.get(i)+" ");
        }

    }
}
//TC is O(N), SC is O(1) if not considering o/p
