package hashing;
import java.lang.*;
import java.util.*;
//check if the number is colourful. Number is colourful if product of all possible combinations of
//digits of the given number is different
//eg 236...nos are 2,3,6,2*3=6, 3*6=18, 2*3*6=26....ans=no as two sixes are there
public class ColourfulNumber {
    //iterate on digits and store prod in hashset. If contains, return no
    //trick-to iterate on all digits whenever temp becomes 0, do A=A/10 and asssign it back to temp
    public int colorful(int A) {
        HashSet<Integer>hs=new HashSet<Integer>();
        int prod=1;
        int B=A;
        //take each digit and store it in hashset.
        //if contains return 0
        while (A>0) {
            int dig=B%10;
            prod=dig*prod;
            if (hs.contains(prod)) {
                return 0;
            }
            else {
                hs.add(prod);
            }
            B=B/10;

            if (B==0) {
                A=A/10;
                B=A;
                prod=1;
            }
        }
        return 1;

    }
}
//TC is O(logn) as iterating on digits, SC is O(N) as hashset