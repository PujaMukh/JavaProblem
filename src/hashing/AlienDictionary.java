package hashing;
//given alien dictionary, check if the given array is in lexigraphic order

import java.lang.*;
import java.util.*;
public class AlienDictionary {
    static int solve(String[] A, String B) {
        int N=A.length; //array
        int M=B.length();

        //store the letter and index in hashmap
        HashMap<Character, Integer>hm=new HashMap<Character, Integer>();

        for (int i=0; i<M; i++) {

            hm.put(B.charAt(i), i); //now we have all characters and their indexes
        }

        if (N==1) {
            return 1;

        }

        else {
            for (int i=0; i<N-1; i++) {

                String s1=A[i];
                String s2=A[i+1];

                int ptr1=0;
                int ptr2=0;
                while (ptr1<s1.length() && ptr2<s2.length()) {

                    if ((hm.get(s1.charAt(ptr1)))<(hm.get(s2.charAt(ptr2)))) {
                        break;
                    }
                    else if ((hm.get(s1.charAt(ptr1)))==hm.get(s2.charAt(ptr2))) {
                        ptr1++;
                        ptr2++;
                    }
                    else if (((hm.get(s1.charAt(ptr1)))>hm.get(s2.charAt(ptr2)))) {
                        return 0;
                    }
                }
                //edge case puja and pujap
                if (ptr1!=s1.length() && ptr2==s2.length()) { //s1=pujap, s2=puja
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        String[]A=new String[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.next();
        }
        String B=sc.next();
        System.out.println(solve(A,B));
    }
}
//TC is O(N), SC is O(1)