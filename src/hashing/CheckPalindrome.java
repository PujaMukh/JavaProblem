package hashing;
//given a string, check if it can be rearranged to form a palindrome
import java.lang.*;
import java.util.*;
public class CheckPalindrome {
    static int solve(String A) {
        //find freq of all characters using hashmap or character array in O(1) space
        //if all freq is even=return 1
        //if all freq even except 1 whose freq is 1, return 1
        //else return 0

        int N=A.length();
        if (N==1) {
            return 1; //edge case as size 1 is palindrome
        }
        HashMap<Character, Integer>hm=new HashMap<Character, Integer>();

        for (int i=0; i<N; i++) {
            if (hm.containsKey(A.charAt(i))) {
                int val=hm.get(A.charAt(i));
                hm.put(A.charAt(i), val+1);   //char and freq hashmap
            }
            else {
                hm.put(A.charAt(i), 1);
            }
        }

        for (int i=0; i<N; i++) {

            if (hm.get(A.charAt(i))%2!=0) {   //all odd, so 0
                int val=hm.get(A.charAt(i)); //if we have 3 letters side by side, it will still be a palindrome as long as others are mod 0
                //but if we dont delete the 1 freq, it will consider odd for all 3 and return 0
                //eg  yzzffyy....check the 2 y's in back, you will get your ans why deducting 1 freq is imp
                hm.put(A.charAt(i), val-1);
                if (hm.get(A.charAt(i+1))%2!=0) {
                    return 0;
                }
            }
            else if (hm.get(A.charAt(i))%2==0) { //if even, continue.......

            }
            if ((hm.get(A.charAt(i))%2!=0) && (hm.get(A.charAt(i+1))%2==0)) {

            }
        }
        return 1;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(solve (A));
    }
}
//TC is O(N), SC is O(1)
