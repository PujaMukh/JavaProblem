package java_string;
/*given a string A which is mix of digits and alphabets(capital or small or mix), return either digits
or alphabet count, whichever has the max count*/

import java.lang.*;
import java.util.*;

public class DiverseCharacter {
        static int Diverse(String A) {
            int N=A.length(); //length of string A
            int c1=0; //variable initialization to store alphabets
            int c2=0;  //variable initialization to store digits

            for(int i=0; i<N; i++) {
                if ((A.charAt(i)>=65 && A.charAt(i)<=90) || (A.charAt(i)>=97 && A.charAt(i)<=122)) {
                    c1++;  //store it here if the character is alphabet
                }
                else {
                    c2++; //else if it is digits, store it here
                }
            }

            if (c1>c2) {   //return whichever is greater (digits/alphabets)
                return c1;
            }
            else if(c1==c2) { //if they have same count, you can return either c1 or c2
                return c1;
            }

            return c2; //else, return c2
        }

        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            String A=sc.next(); //take string A input
            System.out.print(Diverse(A)); ///call the above function
        }
    }


