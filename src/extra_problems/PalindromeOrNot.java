package extra_problems;

import java.util.Scanner;

//given a string, you can swap any 2 characters to form a palindrome. Can a palindrome be formed?
public class PalindromeOrNot {
    //logic: a string can be a palindrome if:
    //1) all character counts are even
    //2) all character counts are even except one character which has odd.
    static int checkIfPalindrome(String A) {
        int[]arr=new int[26];
        int countOdd=0;
        for (int i=0; i<A.length(); i++) {
            arr[A.charAt(i)-'a']++;
        }
        for (int i=0; i<26; i++) {
            if (arr[i]%2!=0) {
                countOdd++;
            }
        }
        if (countOdd>1) {
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(checkIfPalindrome(A));

    }
}
//TC is O(N), SC is O(1)