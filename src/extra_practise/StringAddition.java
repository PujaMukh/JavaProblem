package extra_practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//add string with reverse string
//eg a+1=b, z+a=a etc
//hello=wqxqw
//hint: make a character array with z at index 0 and a at index 1 etc and work on it
public class StringAddition {
   /* static int findIndex(char [] A, char c) {
        for (int i=0; i<A.length; i++) {
            if (c==A[i]) {
                return i;
            }
        }
        return -1;
    } */
    static String stringAdd(String S) {
        /*char[] ch=new char[26];
        for (int i=0; i<26; i++) { //character array
            if (i==0) {
                ch[i]='z';
            }
            else {
                ch[i]=(char)(97+(i-1));
            }

        }*/

        //create a hashmap
        HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
        hm.put('z', 0);
        for (int i=1; i<26; i++) {
            char temp=(char)(97+(i-1));
            hm.put(temp, i);

        }

        HashMap<Integer, Character>hm1=new HashMap<Integer, Character>();
        hm1.put(0,'z');
        for (int i=1; i<26; i++) {
            char temp=(char)(97+(i-1));
            hm1.put(i, temp);

        }

       StringBuilder sb=new StringBuilder();
        //ArrayList<Integer>output=new ArrayList<>();
        int i=0;
        int j=S.length()-1;
        while (i<S.length()) {
            char c1=S.charAt(i); //h
            char c2=S.charAt(j); //o
            int idx1=hm.get(c1);
            int idx2=hm.get(c2);

            sb.append(hm1.get(idx1+idx2));

            i++;
            j--;
        }

        return sb.toString();


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();

        System.out.println(stringAdd(S));
    }
}
